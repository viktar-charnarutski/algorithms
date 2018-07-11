package problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 144. Binary Tree Preorder Traversal
 * <p>
 * Given a binary tree, return the preorder traversal of its nodes' values.
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> rightNodes = new Stack<>();

        TreeNode curr = root;

        while (curr != null || !rightNodes.isEmpty()) {
            if (curr == null) {
                curr = rightNodes.pop();
            }
            result.add(curr.val);

            if (curr.right != null) {
                rightNodes.push(curr.right);
            }
            curr = curr.left;
        }

        return result;
    }

    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversal(root, result);
        return result;
    }

    private void preorderTraversal(TreeNode root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        preorderTraversal(root.left, result);
        preorderTraversal(root.right, result);

    }
}
