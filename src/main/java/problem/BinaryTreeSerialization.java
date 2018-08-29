package problem;

import java.util.Arrays;
import java.util.LinkedList;

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
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }

    private void serialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append(NULL_STR_VALUE).append(DELIMITER);
        } else {
            sb.append(root.val).append(DELIMITER);
            serialize(root.left, sb);
            serialize(root.right, sb);
        }
    }

    public TreeNode restoreTree(String str) {
        LinkedList<String> vals = new LinkedList<>(Arrays.asList(str.split(",")));
        return deserialize(vals);
    }

    private TreeNode deserialize(LinkedList<String> vals) {
        String val = vals.remove();
        if (val.equals(NULL_STR_VALUE)) {
            return null;
        }
        return new TreeNode(Integer.parseInt(val), deserialize(vals), deserialize(vals));
    }
}
