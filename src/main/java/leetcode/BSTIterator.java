package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 173. Binary Search Tree Iterator
 * <p>
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 * <p>
 * Calling next() will return the next smallest number in the BST.
 * <p>
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 */
public class BSTIterator {

    private Queue<Integer> vals;

    public BSTIterator(TreeNode root) {
        this.vals = new LinkedList<>();
        inorderTraversal(root);
    }

    private void inorderTraversal(TreeNode node) {
        TreeNode curr = node;
        Stack<TreeNode> stack = new Stack<>();
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            vals.offer(curr.val);
            curr = curr.right;
        }
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !vals.isEmpty();
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        return this.vals.poll();
    }
}
