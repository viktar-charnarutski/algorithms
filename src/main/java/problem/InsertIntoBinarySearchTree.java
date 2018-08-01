package problem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 701. Insert into a Binary Search Tree
 * <p>
 * Given the root node of a binary search tree (BST) and a value to be inserted into the tree, insert the value into
 * the BST. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in
 * the original BST.
 * <p>
 * Note that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion.
 * You can return any of them.
 */
public class InsertIntoBinarySearchTree {
    // iterative solution
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        while (!nodes.isEmpty()) {
            TreeNode curr = nodes.remove();
            if (curr == null) {
                continue;
            }
            if (curr.val > val) {
                if (curr.left != null) {
                    nodes.offer(curr.left);
                } else {
                    curr.left = new TreeNode(val);
                    break;
                }
            } else {
                if (curr.right != null) {
                    nodes.offer(curr.right);
                } else {
                    curr.right = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }

    // recursive solution
    public TreeNode insertIntoBSTReq(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
