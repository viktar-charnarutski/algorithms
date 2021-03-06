package problem;

/**
 * 112. Path Sum
 * <p>
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all
 * the values along the path equals the given sum.
 * <p>
 * Note: A leaf is a node with no children.
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        if (root.left == null && root.right == null) {
            return root.val == sum;
        }

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
