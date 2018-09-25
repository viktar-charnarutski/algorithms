package problem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 513. Find Bottom Left Tree Value
 * <p>
 * Given a binary tree, find the leftmost value in the last row of the tree.
 */
public class FindBottomLeftTreeValue {

    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        while (!nodes.isEmpty()) {
            root = nodes.remove();
            if (root.right != null) {
                nodes.offer(root.right);
            }
            if (root.left != null) {
                nodes.offer(root.left);
            }
        }
        return root.val;
    }

    private int depth = 0;
    private int leftLvl = 0;

    public int findBottomLeftValueDfs(TreeNode root) {
        find(root, 1);
        return leftLvl;
    }

    public void find(TreeNode root, int level) {
        if (root == null) return;

        if (depth < level) {
            depth = level;
            leftLvl = root.val;
        }
        find(root.left, level + 1);
        find(root.right, level + 1);
    }
}
