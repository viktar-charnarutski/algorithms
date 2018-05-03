package leetcode;

/**
 * 513. Find Bottom Left Tree Value
 * <p>
 * Given a binary tree, find the leftmost value in the last row of the tree.
 */
public class FindBottomLeftTreeValue {
    private int depth = 0;
    private int leftLvl = 0;

    public int findBottomLeftValue(TreeNode root) {
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
