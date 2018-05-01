package leetcode;

/**
 * 543. Diameter of Binary Tree
 * <p>
 * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is
 * the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 */
public class DiameterOfBinaryTree {
    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        lengthOfBranch(root);
        return max;
    }

    private int lengthOfBranch(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int rightLength = lengthOfBranch(node.right);
        int leftLength = lengthOfBranch(node.left);

        max = Math.max(leftLength + rightLength, max);

        return Math.max(leftLength, rightLength) + 1;
    }
}
