package leetcode.easy;

/**
 * 53. Maximum Subarray
 * <p>
 * Given an integer array nums, find the contiguous subarray
 * (containing at least one number) which has the largest sum and return its sum.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        return maxSubArray(nums, 0, Long.MIN_VALUE);
    }

    private int maxSubArray(int[] nums, int i, long maxSum) {
        if (i >= nums.length) {
            return maxSum > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) maxSum;
        }

        long currSum = 0;
        int inx = i;
        while (inx < nums.length) {
            currSum += nums[inx];
            maxSum = Math.max(currSum, maxSum);
            inx++;
        }
        return maxSubArray(nums, i + 1, maxSum);
    }
}
