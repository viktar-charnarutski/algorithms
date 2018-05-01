package leetcode;

/**
 * 674. Longest Continuous Increasing Subsequence
 * <p>
 * Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).
 */
public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = 0;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 1;
            }
        }
        max = Math.max(count, max);
        return max;
    }
}
