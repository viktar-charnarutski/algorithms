package problem;

/**
 * 543. Diameter of Binary Tree
 * <p>
 * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is
 * the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 */
public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxLength(root.left);
        int right = maxLength(root.right);
        int curr = left + right;
        return Math.max(curr, Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
    }

    private int maxLength(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxLength(root.left), maxLength(root.right));
    }
}
