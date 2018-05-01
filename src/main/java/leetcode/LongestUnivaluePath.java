package leetcode;

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
        path(root, root.val);
        return max;
    }

    private int path(TreeNode root, int val) {
        if (root == null) return 0;

        int left = path(root.left, root.val);
        int right = path(root.right, root.val);

        max = Math.max(left + right, max);

        if (root.val == val) return Math.max(left, right) + 1;

        return 0;
    }
}
