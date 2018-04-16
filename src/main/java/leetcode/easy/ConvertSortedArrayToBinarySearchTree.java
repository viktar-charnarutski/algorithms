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
        int midIndex = nums.length / 2;
        TreeNode root = new TreeNode(nums[midIndex]);
        appendLeftNodes(root, midIndex - 1, nums);
        appendRightNodes(root, midIndex + 1, nums);

        return root;
    }

    private void appendLeftNodes(TreeNode node, int index, int[] nums) {
        if (index < 0) return;

        TreeNode childNode = new TreeNode(nums[index]);
        node.left = childNode;
        appendLeftNodes(childNode, --index, nums);
    }

    private void appendRightNodes(TreeNode node, int index, int[] nums) {
        if (index == nums.length) return;

        TreeNode childNode = new TreeNode(nums[index]);
        node.right = childNode;
        appendRightNodes(childNode, ++index, nums);
    }
}
