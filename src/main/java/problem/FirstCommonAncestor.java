package problem;

import java.util.Stack;

/**
 * First Common Ancestor
 * <p>
 * Design an algorithm and write code to find the first common ancestor
 * of two nodes in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not
 * necessarily a binary search tree.
 */
public class FirstCommonAncestor {

    public TreeNode firstCommonAncestor(TreeNode root, TreeNode node1, TreeNode node2) {
        Stack<TreeNode> path1Stack = getPathAsStack(root, node1);
        Stack<TreeNode> path2Stack = getPathAsStack(root, node2);
        return commonNode(path1Stack, path2Stack);
    }

    private TreeNode commonNode(Stack<TreeNode> path1Stack, Stack<TreeNode> path2Stack) {
        while (!path1Stack.isEmpty() && !path2Stack.isEmpty()) {
            TreeNode node1 = path1Stack.pop();
            TreeNode node2 = path2Stack.pop();
            if (node1.equals(node2)) {
                return node1;
            }
        }
        return null;
    }

    Stack<TreeNode> getPathAsStack(TreeNode root, TreeNode node) {
        Stack<TreeNode> path = new Stack<>();
        hasPath(root, node, path);
        return path;
    }

    private boolean hasPath(TreeNode root, TreeNode node, Stack<TreeNode> path) {
        if (root == null) return false;

        if (root.equals(node)) {
            return true;
        }

        path.push(root);

        if (hasPath(root.left, node, path) || hasPath(root.right, node, path)) {
            return true;
        }

        path.pop();

        return false;
    }
}
