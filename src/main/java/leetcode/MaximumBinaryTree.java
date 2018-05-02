package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * 654. Maximum Binary Tree
 * <p>
 * Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:
 * <p>
 * The root is the maximum number in the array.
 * The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
 * The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
 * Construct the maximum tree by the given array and output the root node of this tree.
 */
public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        HashMap<Integer, Integer> indexes = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indexes.put(nums[i], i);
        }

        int max = nums[0];

        for (int num : nums) {
            max = Math.max(num, max);
        }

        int maxInd = indexes.get(max);
        int[] leftElements = new int[maxInd];
        int[] rightElements = new int[nums.length - maxInd - 1];

        System.arraycopy(nums, 0, leftElements, 0, maxInd);
        System.arraycopy(nums, maxInd + 1, rightElements, 0, nums.length - maxInd - 1);

        Arrays.sort(leftElements);
        Arrays.sort(rightElements);

        TreeNode root = new TreeNode(max);
        LinkedList<TreeNode> nodes = new LinkedList<>();

        if (leftElements.length > 0) {
            root.left = new TreeNode(leftElements[leftElements.length - 1]);
            nodes.add(root.left);

            for (int i = leftElements.length - 2; i >= 0; i--) {
                TreeNode node = nodes.remove();
                node.left = new TreeNode(leftElements[i]);
                nodes.add(node.left);
            }
        }

        if (rightElements.length > 0) {
            root.right = new TreeNode(rightElements[rightElements.length - 1]);
            nodes.clear();
            nodes.add(root.right);

            for (int i = rightElements.length - 2; i >= 0; i--) {
                TreeNode node = nodes.remove();
                node.right = new TreeNode(rightElements[i]);
                nodes.add(node.right);
            }
        }

        return root;
    }

}
