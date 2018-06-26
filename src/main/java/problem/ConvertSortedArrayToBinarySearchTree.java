package problem;

/**
 * 108. Convert Sorted Array to Binary Search Tree
 * <p>
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * <p>
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of
 * the two subtrees of every node never differ by more than 1.
 */
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length < 1) return null;
        return append(nums, 0, nums.length - 1);
    }

    private static TreeNode append(int[] nums, int left, int right) {
        if (left > right) return null;

        int midIndex = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[midIndex]);
        node.left = append(nums, left, midIndex - 1);
        node.right = append(nums, midIndex + 1, right);
        return node;
    }
}
