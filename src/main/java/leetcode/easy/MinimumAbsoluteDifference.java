package leetcode.easy;

import java.util.Stack;

/**
 * 530. Minimum Absolute Difference in BST
 * <p>
 * Given a binary search tree with non-negative values,
 * find the minimum absolute difference between values of any two nodes.
 */
public class MinimumAbsoluteDifference {
    public int getMinimumDifference(TreeNode root) {
        int min = Integer.MAX_VALUE;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode pre = null;
        while (cur != null || !stack.empty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                if (pre != null)
                    min = Math.min(min, cur.val - pre.val);
                pre = cur;
                cur = cur.right;
            }
        }
        return min;
    }
}
