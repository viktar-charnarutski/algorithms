package leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 257. Binary Tree Paths
 * <p>
 * Given a binary tree, return all root-to-leaf paths.
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return Collections.emptyList();

        ArrayList<String> output = new ArrayList<>();
        if (root.left == null && root.right == null) {
            output.add(String.valueOf(root.val));
            return output;
        }

        if (root.left != null) {
            binaryTreePaths(root.left, output, new StringBuilder().append(root.val));
        }
        if (root.right != null) {
            binaryTreePaths(root.right, output, new StringBuilder().append(root.val));
        }
        return output;
    }

    private void binaryTreePaths(TreeNode node, ArrayList<String> output, StringBuilder sb) {
        sb.append("->").append(node.val);

        if (node.left == null && node.right == null) {
            output.add(sb.toString());
            return;
        }

        if (node.left != null) {
            binaryTreePaths(node.left, output, new StringBuilder(sb));
        }
        if (node.right != null) {
            binaryTreePaths(node.right, output, new StringBuilder(sb));
        }
    }
}
