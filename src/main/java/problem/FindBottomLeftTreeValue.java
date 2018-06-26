package problem;

import java.util.LinkedList;

/**
 * 513. Find Bottom Left Tree Value
 * <p>
 * Given a binary tree, find the leftmost value in the last row of the tree.
 */
public class FindBottomLeftTreeValue {

        public int findBottomLeftValue(TreeNode root) {
            int res = root.val;

            LinkedList<TreeNode> nodes = new LinkedList<>();
            nodes.add(root);

            while (!nodes.isEmpty()) {
                TreeNode node = nodes.remove();

                TreeNode left = node.left;
                TreeNode right = node.right;

                if (right != null) {
                    nodes.add(right);
                    res = right.val;
                }
                if (left != null) {
                    nodes.add(left);
                    res = left.val;
                }
            }
            return res;
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
