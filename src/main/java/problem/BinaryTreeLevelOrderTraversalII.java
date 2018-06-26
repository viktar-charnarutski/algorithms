package problem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 107. Binary Tree Level Order Traversal II
 * <p>
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 * (ie, from left to right, level by level from leaf to root).
 */
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return new LinkedList<>();
        LinkedList<List<Integer>> result = new LinkedList<>();

        LinkedList<TreeNode> checkList = new LinkedList<>();
        checkList.add(root);

        while (!checkList.isEmpty()) {

            List<Integer> row = new ArrayList<>();
            int size = checkList.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = checkList.remove();
                row.add(node.val);

                TreeNode left = node.left;
                TreeNode right = node.right;

                if (left != null) {
                    checkList.add(left);
                }
                if (right != null) {
                    checkList.add(right);
                }
            }

            result.addFirst(row);
        }
        return result;
    }
}
