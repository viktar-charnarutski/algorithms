package problem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Route Between Nodes
 *
 * Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
 */
public class RouteBetweenNodes {

    public boolean isRouteBetweenNodes(TreeNode node1, TreeNode node2) {
        if (node1 == null || node2 == null) return false;

        Queue<TreeNode> nodesToCheck = new LinkedList<>();
        nodesToCheck.offer(node1);

        boolean isFound = false;
        while (!nodesToCheck.isEmpty()) {
            TreeNode currNode = nodesToCheck.poll();
            if (currNode.equals(node2)) {
                isFound = true;
            } else {
                if (currNode.left != null) nodesToCheck.offer(currNode.left);
                if (currNode.right != null) nodesToCheck.offer(currNode.right);
            }
        }
        return isFound;
    }
}
