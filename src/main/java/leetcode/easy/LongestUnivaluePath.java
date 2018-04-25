package leetcode.easy;

/**
 * 687. Longest Univalue Path
 * <p>
 * Given a binary tree, find the length of the longest path where each node in the path has the same value.
 * This path may or may not pass through the root.
 * <p>
 * Note: The length of path between two nodes is represented by the number of edges between them.
 */
public class LongestUnivaluePath {

    int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;
        path(root);
        return max;
    }

    private int path(TreeNode root) {
        if (root == null) return 0;

        int left = path(root.left);
        int right = path(root.right);

        int arrowLeft = 0;
        int arrowRight = 0;

        if (root.left != null && root.left.val == root.val) {
            arrowLeft += left + 1;
        }

        if (root.right != null && root.right.val == root.val) {
            arrowRight += right + 1;
        }

        max = Math.max(arrowLeft + arrowRight, max);

        return Math.max(arrowLeft, arrowRight);
    }
}
