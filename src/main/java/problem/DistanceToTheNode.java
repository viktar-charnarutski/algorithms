package problem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Distance of a node from the root
 * <p>
 * Given the root of a Binary Tree  and an integer that represents the data value of a TreeNode present in the tree,
 * write a method - pathLengthFromRoot that returns the distance between the root and that node. You can assume that
 * the given key exists in the tree. The distance is defined as the minimum number of nodes that must be traversed to
 * reach the target node.
 */
public class DistanceToTheNode {
    public int pathLengthFromRoot(TreeNode root, int n1) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        int cnt = 0;
        while (!nodes.isEmpty()) {
            cnt++;
            int size = nodes.size();
            while (size-- > 0) {
                root = nodes.remove();
                if (root.val == n1) {
                    return cnt;
                }
                if (root.left != null) {
                    nodes.add(root.left);
                }
                if (root.right != null) {
                    nodes.add(root.right);
                }
            }
        }
        return cnt;
    }
}
