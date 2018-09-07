package problem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Find the Level that has the Maximum Sum
 * <p>
 * Given a binary tree, write a method to return the level that has the maximum sum.
 * In case the tree is empty, return -1
 */
public class MaximumSumLevel {
    public int findMaxSumLevel(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int currLevel = 0, currSum = 0, maxLevel = 0, maxSum = 0;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            while (size-- > 0) {
                TreeNode curr = nodes.remove();
                currSum += curr.val;
                if (curr.left != null) {
                    nodes.offer(curr.left);
                }
                if (curr.right != null) {
                    nodes.offer(curr.right);
                }
            }
            if (currSum > maxSum) {
                maxSum = currSum;
                maxLevel = currLevel;
            }
            currSum = 0;
            currLevel++;
        }
        return maxLevel;
    }
}
