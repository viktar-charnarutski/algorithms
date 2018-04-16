package leetcode.easy;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * 671. Second Minimum Node In a Binary Tree
 * <p>
 * Given a non-empty special binary tree consisting of nodes with the non-negative value,
 * where each node in this tree has exactly two or zero sub-node.
 * If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes.
 * <p>
 * Given such a binary tree, you need to output the second minimum value in the set made of all the nodes'
 * value in the whole tree.
 * <p>
 * If no such second minimum value exists, output -1 instead.
 */
public class SecondMinimumNodeInABinaryTree {

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return -1;

        int min = root.val;
        int nextMin = Integer.MAX_VALUE;

        LinkedList<TreeNode> checkList = new LinkedList<>();
        checkList.add(root.left);
        checkList.add(root.right);

        HashSet<Integer> values = new HashSet<>();

        while (!checkList.isEmpty()) {
            TreeNode node = checkList.remove();
            if (node == null) continue;

            values.add(node.val);

            checkList.add(node.left);
            checkList.add(node.right);
        }

        for (int val : values) {
            if (val > min && val < nextMin) {
                nextMin = val;
            }
        }

        return nextMin < Integer.MAX_VALUE ? nextMin : -1;
    }
}
