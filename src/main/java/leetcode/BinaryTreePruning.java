package leetcode;

/**
 * 814. Binary Tree Pruning
 * <p>
 * We are given the head node root of a binary tree, where additionally every node's value is either a 0 or a 1.
 * <p>
 * Return the same tree where every subtree (of the given tree) not containing a 1 has been removed.
 * <p>
 * (Recall that the subtree of a node X is X, plus every node that is a descendant of X.)
 */
public class BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {

        if (shouldBePruned(root)) {
            return null;
        }

        if (shouldBePruned(root.left)) {
            root.left = null;
        } else {
            root.left = pruneTree(root.left);
        }

        if (shouldBePruned(root.right)) {
            root.right = null;
        } else {
            root.right = pruneTree(root.right);
        }

        return root;
    }

    private static boolean shouldBePruned(TreeNode node) {
        return node == null || nodeHasZeroVal(node) &&
                (nodeHasNoChildren(node) || nodeHasChildrenWithZeroVal(node));
    }

    private static boolean nodeHasChildrenWithZeroVal(TreeNode node) {
        return nodeHasZeroVal(node.left) && nodeHasZeroVal(node.right);
    }

    private static boolean nodeHasZeroVal(TreeNode node) {
        return node != null && node.val == 0;
    }

    private static boolean nodeHasNoChildren(TreeNode node) {
        return node.right == null && node.left == null;
    }
}
