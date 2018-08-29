package problem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 297. Serialize and Deserialize Binary Tree
 * <p>
 * In Computer Science, serialization is the process of converting objects or data structures into a sequence
 * (or series) of characters that can be stored easily in a file / database table or transmitted across a network.
 * Serialized objects need to be de-serialized to create a semantically identical clone of the original object, before
 * being used in programs. You're given the root node of a binary tree - TreeNode root in the method serializeTree.
 * This method should serialize the binary tree and output a String str, which is then used as an input parameter for
 * the method restoreTree. restoreTree should create a Binary Tree that is structurally identical to the one you
 * serialized and return the root node of the tree. Your task is to fill in the logic for these 2 methods.
 * <p>
 * Don't worry about passing the serialized String to restoreTree - that will be done automatically when you run your
 * code. Feel free to use any notation you prefer when serializing the binary tree. The choice of traversal algorithm
 * is also open - but try and limit the time complexity of both methods to O(n).
 */
public class BinaryTreeSerialization {
    private static final String DELIMITER = ",";
    private static final String NULL_STR_VALUE = "null";
    public String serializeTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        while (!nodes.isEmpty()) {
            TreeNode curr = nodes.remove();
            if (curr != null) {
                sb.append(curr.val).append(DELIMITER);
                nodes.offer(curr.left);
                nodes.offer(curr.right);
            } else {
                sb.append(NULL_STR_VALUE).append(DELIMITER);
            }
        }
        return sb.toString();
    }

    public TreeNode restoreTree(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String[] vals = str.split(DELIMITER);

        TreeNode head = new TreeNode(Integer.parseInt(vals[0]));

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(head);

        int i = 1;
        while (!nodes.isEmpty()) {
            TreeNode curr = nodes.remove();

            appendLeft(vals[i++], curr);
            appendRight(vals[i++], curr);

            if (curr.left != null) {
                nodes.offer(curr.left);
            }
            if (curr.right != null) {
                nodes.offer(curr.right);
            }
        }
        return head;
    }

    private void appendRight(String val, TreeNode curr) {
        try {
            if (!val.equals(NULL_STR_VALUE)) {
                int data = Integer.parseInt(val);
                curr.right = new TreeNode(data);
            }
        } catch (NumberFormatException e) {
            // do nothing
        }
    }

    private void appendLeft(String val, TreeNode curr) {
        try {
            if (!val.equals(NULL_STR_VALUE)) {
                int data = Integer.parseInt(val);
                curr.left = new TreeNode(data);
            }
        } catch (NumberFormatException e) {
            // do nothing
        }
    }
}
