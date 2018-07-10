package problem;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Build Order
 * <p>
 * You are given a list of projects and a list of dependencies (which is a list of pairs of
 * projects, where the second project is dependent on the first project). All of a project's dependencies
 * must be built before the project is. Find a build order that will allow the projects to be built. If there
 * is no valid build order, return an error.
 */
public class BuildOrder {

    public char[] buildOrder(char[] projects, char[][] dependencies) {
        HashMap<Character /*project name*/, Project> projectsMap = getProjectsMap(projects);
        assignDependencies(dependencies, projectsMap);

        ArrayList<Project> completedProjects = new ArrayList<>();
        for (char projectName : projects) {
            Project project = projectsMap.get(projectName);
            if (!project.isCompleted) {
                completeProjectWithDependencies(project, completedProjects);
            }
        }
        System.out.println(completedProjects);
        return createOrderArray(projects, completedProjects);
    }

    private char[] createOrderArray(char[] projects, ArrayList<Project> completedProjects) {
        char[] result = new char[projects.length];
        int index = 0;
        for (Project project : completedProjects) {
            result[index++] = project.name;
        }
        return result;
    }

    private HashMap<Character, Project> getProjectsMap(char[] projects) {
        HashMap<Character /*project name*/, Project> projectsMap = new HashMap<>();
        for (char projectName : projects) {
            projectsMap.put(projectName, new Project(projectName));
        }
        return projectsMap;
    }

    private void assignDependencies(char[][] dependencies, HashMap<Character, Project> projectsMap) {
        for (char[] dependency : dependencies) {
            Project project = projectsMap.get(dependency[0]);
            Project dependentProject = projectsMap.get(dependency[1]);
            project.addDependency(dependentProject);
        }
    }

    private void completeProjectWithDependencies(Project project, ArrayList<Project> completedProjects) {
        if (project.isCompleted) return;

        ArrayList<Project> dependentProjects = project.dependencies;
        if (dependentProjects.size() > 0) {
            for (Project dependentProject : dependentProjects) {
                completeProjectWithDependencies(dependentProject, completedProjects);
            }
        }
        project.complete();
        completedProjects.add(project);
    }

    private static class Project {
        char name;
        ArrayList<Project> dependencies;
        boolean isCompleted;

        Project(char name) {
            this.name = name;
            dependencies = new ArrayList<>();
        }

        void addDependency(Project dependency) {
            dependencies.add(dependency);
        }

        void complete() {
            isCompleted = true;
        }

        @Override
        public String toString() {
            return "Project{" +
                    "name=" + name +
                    '}';
        }
    }
}
