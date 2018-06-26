package problem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 449. Serialize and Deserialize BST
 * <p>
 * <p>
 * Serialization is the process of converting a data structure or object into a sequence of bits so
 * that it can be stored in a file or memory buffer, or transmitted across a network connection link
 * to be reconstructed later in the same or another computer environment.
 * <p>
 * Design an algorithm to serialize and deserialize a binary search tree. There is no restriction on how your
 * serialization/deserialization algorithm should work. You just need to ensure that a binary search tree can
 * be serialized to a string and this string can be deserialized to the original tree structure.
 * <p>
 * The encoded string should be as compact as possible.
 * <p>
 * Note: Do not use class member/global/static variables to store states.
 * Your serialize and deserialize algorithms should be stateless.
 */
public class SerializeAndDeserializeBST {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return null;
        StringBuilder strb = new StringBuilder();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            root = stack.pop();
            strb.append(root.val).append(",");
            if (root.right != null) stack.push(root.right);
            if (root.left != null) stack.push(root.left);
        }
        return strb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null) return null;
        Queue<Integer> queue = new LinkedList<>();
        String[] vals = data.split(",");
        for (String val : vals) {
            queue.offer(Integer.parseInt(val));
        }
        return treeFromQueue(queue);
    }


    private TreeNode treeFromQueue(Queue<Integer> queue) {
        if (queue == null || queue.isEmpty()) return null;

        TreeNode node = new TreeNode(queue.poll());
        Queue<Integer> smallersQueue = new LinkedList<>();

        while (!queue.isEmpty() && queue.peek() < node.val) {
            smallersQueue.offer(queue.poll());
        }

        node.left = treeFromQueue(smallersQueue);
        node.right = treeFromQueue(queue);

        return node;
    }
}
