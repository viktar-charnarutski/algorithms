package leetcode;

/**
 * 300. Longest Increasing Subsequence
 * <p>
 * Given an unsorted array of integers, find the length of longest increasing subsequence.
 */
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        return lengthOfLIS(nums, Integer.MIN_VALUE, 0);
    }

    private int lengthOfLIS(int[] nums, int prev, int i) {
        if (i == nums.length) return 0;

        int taken = 0;
        if (nums[i] > prev) {
            taken = 1 + lengthOfLIS(nums, nums[i], i + 1);
        }

        int nottaken = lengthOfLIS(nums, prev, i + 1);
        return Math.max(taken, nottaken);
    }
}
