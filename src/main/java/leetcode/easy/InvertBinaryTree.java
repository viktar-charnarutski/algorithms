package leetcode.easy;

import java.util.LinkedList;

/**
 * 226. Invert Binary Tree
 * <p>
 * Invert a binary tree.
 * <p>
 * 4
 * /   \
 * 2     7
 * / \   / \
 * 1   3 6   9
 * <p>
 * to
 * <p>
 * 4
 * /   \
 * 7     2
 * / \   / \
 * 9   6 3   1
 */
class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null || root.left == null && root.right == null) return root;

        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);

        return root;
    }

    public TreeNode invertTreeSlow(TreeNode root) {
        if (root == null || root.left == null && root.right == null) return root;

        LinkedList<TreeNode> nodesToRevert = new LinkedList<>();

        nodesToRevert.add(root);

        while (!nodesToRevert.isEmpty()) {
            TreeNode node = nodesToRevert.remove();
            if (node.left != null) {
                nodesToRevert.add(node.left);
            }
            if (node.right != null) {
                nodesToRevert.add(node.right);
            }
            swapNodes(node);
        }
        return root;
    }

    private static void swapNodes(TreeNode node) {
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
    }
}