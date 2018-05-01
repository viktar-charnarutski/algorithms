package leetcode;

/**
 * 110. Balanced Binary Tree
 * <p>
 * Given a binary tree, determine if it is height-balanced.
 * <p>
 * For this problem, a height-balanced binary tree is defined as:
 * a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int leftHigh = depth(root.left);
        int rightHigh = depth(root.right);

        if ((Math.abs(leftHigh - rightHigh)) > 1) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode node) {
        if (node == null) return 0;

        int leftHigh = depth(node.left);
        int rightHigh = depth(node.right);

        return 1 + Math.max(leftHigh, rightHigh);
    }
}
