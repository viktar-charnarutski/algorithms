package problem;

/**
 * Check Balanced
 * <p>
 * Implement a function to check if a binary tree is balanced.
 * <p>
 * For the purposes of this question, a balanced tree is defined to be a tree such that
 * the heights of the two subtrees of any node never differ by more than one.
 */
public class CheckBalanced {

    public boolean isBalanced(TreeNode node) {
        int maxDepth = maxDepth(node);
        int minDepth = minDepth(node);
        return maxDepth - minDepth <= 1;
    }

    private int maxDepth(TreeNode node) {
        if (node == null) return 0;
        return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
    }

    private int minDepth(TreeNode node) {
        if (node == null) return 0;
        return Math.min(minDepth(node.left), minDepth(node.right)) + 1;
    }

}
