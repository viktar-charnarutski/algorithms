package problem;

/**
 * Validate BST
 * <p>
 * Implement a function to check if a binary tree is a binary search tree.
 */
public class ValidateBst {
    public boolean isBst(TreeNode node) {
        if (node == null) return true;

        TreeNode left = node.left;
        TreeNode right = node.right;

        boolean isBst = false;

        if (left != null && right != null) {

            if (left.val < node.val && right.val > node.val) {
                isBst = isBst(left) && isBst(right);
            }

        } else if (left != null && left.val < node.val) {
            isBst = isBst(left);

        } else if (right != null && right.val > node.val) {
            isBst = isBst(right);

        } else {
            isBst = true;
        }

        return isBst;
    }
}
