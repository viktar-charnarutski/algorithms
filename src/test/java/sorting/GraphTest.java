package sorting;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GraphTest {

    private Graph graph = new Graph();

    {
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addNode(5);
        graph.addNode(6);
        graph.addNode(7);
        graph.addNode(8);
        graph.addNode(9);
        graph.addNode(10);

        graph.addEdge(1, 2);
        graph.addEdge(2, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 9);
        graph.addEdge(9, 8);

        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 7);
    }

    @Test
    public void hasPathDfs() {
        assertTrue(graph.hasPathDfs(1, 8));
        assertTrue(graph.hasPathDfs(2, 7));
        assertFalse(graph.hasPathDfs(1, 10));
    }

    @Test
    public void hasPathBfs() {
        assertTrue(graph.hasPathBfs(1, 8));
        assertTrue(graph.hasPathBfs(2, 7));
        assertFalse(graph.hasPathBfs(1, 10));
    }
}