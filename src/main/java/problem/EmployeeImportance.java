package problem;

import java.util.HashMap;
import java.util.List;

/**
 * 690. Employee Importance
 * <p>
 * You are given a data structure of employee information, which includes the employee's unique id,
 * his importance value and his direct subordinates' id.
 * <p>
 * For example, employee 1 is the leader of employee 2, and employee 2 is the leader of employee 3.
 * They have importance value 15, 10 and 5, respectively.
 * Then employee 1 has a data structure like [1, 15, [2]], and employee 2 has [2, 10, [3]],
 * and employee 3 has [3, 5, []]. Note that although employee 3 is also a subordinate of employee 1,
 * the relationship is not direct.
 * <p>
 * Now given the employee information of a company, and an employee id, you need to return the
 * total importance value of this employee and all his subordinates.
 */
class EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> empMap = new HashMap<>();
        for (Employee e : employees) {
            empMap.put(e.id, e);
        }
        return getImportanceForEmployee(empMap, id);

    }

    private int getImportanceForEmployee(HashMap<Integer, Employee> empMap, int id) {
        Employee employee = empMap.get(id);

        if (employee == null) return 0;

        int importance = employee.importance;
        for (int subordinateId : employee.subordinates) {
            importance += getImportanceForEmployee(empMap, subordinateId);
        }
        return importance;
    }

    // Employee info
    static class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;

        public Employee(int id, int importance, List<Integer> subordinates) {
            this.id = id;
            this.importance = importance;
            this.subordinates = subordinates;
        }
    }
}
