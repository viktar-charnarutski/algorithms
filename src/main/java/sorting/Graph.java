package sorting;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

/**
 * Basics of graph search and common operations; Depth First Search (DFS) and Breadth First Search (BFS).
 */
public class Graph {

    private Map<Integer, Node> nodeLookup = new HashMap<>();

    private static class Node {
        private int id;
        LinkedList<Node> adjacent = new LinkedList<>();

        Node(int id) {
            this.id = id;
        }
    }

    public void addNode(int id) {
        nodeLookup.put(id, new Node(id));
    }

    private Node getNode(int id) {
        return nodeLookup.get(id);
    }

    public void addEdge(int sourceId, int destinationId) {
        Node sourceNode = getNode(sourceId);
        Node destinationNode = getNode(destinationId);
        sourceNode.adjacent.add(destinationNode);
    }

    public boolean hasPathDfs(int sourceId, int destinationId) {
        Node sourceNode = getNode(sourceId);
        Node destinationNode = getNode(destinationId);

        HashSet<Integer> visitedNodes = new HashSet<>();
        return hasPathDfs(sourceNode, destinationNode, visitedNodes);
    }

    public boolean hasPathBfs(int sourceId, int destinationId) {
        return hasPathBfs(getNode(sourceId), getNode(destinationId));
    }

    private boolean hasPathDfs(Node sourceNode, Node destinationNode, HashSet<Integer> visitedNodes) {
        if (visitedNodes.contains(sourceNode.id)) {
            return false;
        }

        visitedNodes.add(sourceNode.id);

        if (sourceNode == destinationNode) {
            return true;
        }

        for (Node node : sourceNode.adjacent) {
            if (hasPathDfs(node, destinationNode, visitedNodes)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasPathBfs(Node sourceNode, Node destinationNode) {
        LinkedList<Node> nextNodeToVisit = new LinkedList<>();
        HashSet<Integer> visitedNodes = new HashSet<>();

        nextNodeToVisit.add(sourceNode);

        while (!nextNodeToVisit.isEmpty()) {

            Node node = nextNodeToVisit.remove();

            if (visitedNodes.contains(node.id)) {
                continue;
            }

            if (node == destinationNode) {
                return true;
            }

            visitedNodes.add(node.id);

            nextNodeToVisit.addAll(node.adjacent);
        }
        return false;
    }
}