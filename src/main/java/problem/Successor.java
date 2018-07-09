package problem;

/**
 * Successor
 * <p>
 * Write an algorithm to find the "next" node (i.e., in-order successor) of a given node in a
 * binary search tree. You may assume that each node has a link to its parent.
 */
public class Successor {

    public TreeNode successor(TreeNode root, TreeNode node) {
        if (root == null) return null;

        TreeNode prev = null;
        TreeNode curr = root;
        while (curr != null) {
            if (curr.val > node.val) {
                prev = curr;
                curr = curr.left;
            } else if (curr.val < node.val) {
                prev = curr;
                curr = curr.right;
            } else {
                break;
            }
        }

        return prev;
    }
}
