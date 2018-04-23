package leetcode.easy;

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
        return pathSum(root, sum);
    }

    private boolean pathSum(TreeNode node, int sum) {
        if (node == null) return false;

        if (node.left == null && node.right == null) {
            return node.val == sum;
        }

        return pathSum(node.left, sum - node.val) || pathSum(node.right, sum - node.val);
    }
}
