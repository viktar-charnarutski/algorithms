package leetcode;

/**
 * 104. Maximum Depth of Binary Tree
 * <p>
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the
 * farthest leaf node.
 * <p>
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        return bsf(root, 0);
    }

    private static int bsf(TreeNode node, int depth) {
        if (node == null) return depth;
        depth++;
        return Math.max(bsf(node.left, depth), bsf(node.right, depth));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
