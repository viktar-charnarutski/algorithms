package leetcode;

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
    public BSTIterator(TreeNode root) {

    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return false;
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        return -1;
    }
}
