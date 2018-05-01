package leetcode;

/**
 * 404. Sum of Left Leaves
 * <p>
 * Find the sum of all left leaves in a given binary tree.
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        TreeNode left = root.left;
        TreeNode right = root.right;

        int leftVal = 0;
        if (left != null && left.left == null && left.right == null) {
            leftVal = left.val;
        }

        return leftVal + sumOfLeftLeaves(left) + sumOfLeftLeaves(right);
    }
}
