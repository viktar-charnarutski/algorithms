package problem;

/**
 * 124. Binary Tree Maximum Path Sum
 * <p>
 * Given a non-empty binary tree, find the maximum path sum.
 * <p>
 * For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along
 * the parent-child connections. The path must contain at least one node and does not need to go through the root.
 */
public class BinaryTreeMaximumPathSum {
    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        Integer maxLeft = maxSum(root.left);
        Integer maxRight = maxSum(root.right);
        int currSum = root.val + (maxLeft != null && maxLeft > 0 ? maxLeft : 0) +
                (maxRight != null && maxRight > 0 ? maxRight : 0);
        return Math.max(currSum, Math.max(maxPathSum(root.left), maxPathSum(root.right)));
    }

    private Integer maxSum(TreeNode root) {
        if (root == null) {
            return null;
        }
        int res = root.val;
        Integer maxLeft = maxSum(root.left);
        Integer maxRight = maxSum(root.right);
        if (maxLeft != null && maxRight != null) {
            int max = Math.max(maxLeft, maxRight);
            res += max > 0 ? max : 0;
        } else if (maxLeft != null && maxLeft > 0) {
            res += maxLeft;
        } else if (maxRight != null && maxRight > 0) {
            res += maxRight;
        }
        return res;
    }
}
