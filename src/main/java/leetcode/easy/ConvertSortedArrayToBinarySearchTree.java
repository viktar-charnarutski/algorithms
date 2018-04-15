package leetcode.easy;

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
        int mid = nums[nums.length / 2];

        TreeNode root = new TreeNode(mid);
        int left = mid - 1;
        int right = mid + 1;
        TreeNode currNode = root;
        while (left >= 0 && right < nums.length) {
            TreeNode leftNode = new TreeNode(nums[left]);
            TreeNode rightNode = new TreeNode(nums[right]);
            currNode.left = leftNode;
            currNode.right= rightNode;

            left--;
            right++;
        }

        return null;
    }
}
