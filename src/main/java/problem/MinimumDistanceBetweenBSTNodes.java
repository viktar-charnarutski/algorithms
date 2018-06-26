package problem;

/**
 * 783. Minimum Distance Between BST Nodes
 * <p>
 * Given a Binary Search Tree (BST) with the root node root,
 * return the minimum difference between the values of any two different nodes in the tree.
 */
public class MinimumDistanceBetweenBSTNodes {

    private Integer minVal = Integer.MAX_VALUE;
    private TreeNode prevNode;

    public int minDiffInBST(TreeNode root) {
        if (root.left != null) minDiffInBST(root.left);
        if (prevNode != null) {
            minVal = Math.min(root.val - prevNode.val, minVal);
        }
        prevNode = root;
        if (root.right != null) minDiffInBST(root.right);
        return minVal;
    }
}
