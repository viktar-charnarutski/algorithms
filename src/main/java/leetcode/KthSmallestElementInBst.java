package leetcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 230. Kth Smallest Element in a BST
 * <p>
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 * <p>
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 */
public class KthSmallestElementInBst {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> vals = new ArrayList<>();
        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.add(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            vals.add(curr.val);
            curr = curr.right;
        }
        return vals.get(k - 1);
    }
}
