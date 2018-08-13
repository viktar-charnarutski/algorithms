package problem;

import java.util.HashMap;
import java.util.Map;

/**
 * 662. Maximum Width of Binary Tree
 * <p>
 * Given a binary tree, write a function to get the maximum width of the given tree. The width of a tree is the maximum
 * width among all levels. The binary tree has the same structure as a full binary tree, but some nodes are null.
 * <p>
 * The width of one level is defined as the length between the end-nodes (the leftmost and right most non-null nodes in
 * the level, where the null nodes between the end-nodes are also counted into the length calculation.
 */
public class MaximumWidthOfBinaryTree {
    private int maxWidth = 0;
    private Map<Integer /* depth */, Integer /* pos if the left most node */> leftPositions = new HashMap<>();

    public int widthOfBinaryTree(TreeNode root) {
        widthOfBinaryTree(root, 0, 1);
        return maxWidth;
    }

    private void widthOfBinaryTree(TreeNode node, int depth, int position) {
        if (node == null) {
            return;
        }

        leftPositions.putIfAbsent(depth, position);
        maxWidth = Math.max(position - leftPositions.get(depth) + 1, maxWidth);
        widthOfBinaryTree(node.left, depth + 1, position * 2);
        widthOfBinaryTree(node.right, depth + 1, position * 2 + 1);
    }
}
