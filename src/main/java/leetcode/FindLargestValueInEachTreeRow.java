package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 515. Find Largest Value in Each Tree Row
 *
 * You need to find the largest value in each row of a binary tree.
 */
public class FindLargestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) return Collections.emptyList();

        ArrayList<Integer> res = new ArrayList<>();

        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);

        while (!nodes.isEmpty()) {
            int max = Integer.MIN_VALUE;
            int size = nodes.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.poll();

                max = Math.max(node.val, max);

                if (node.right != null) nodes.offer(node.right);
                if (node.left != null) nodes.offer(node.left);
            }
            res.add(max);
        }
        return res;
    }
}
