package problem;

import java.util.Arrays;

/**
 * 416. Partition Equal Subset Sum
 * <p>
 * Given a non-empty array containing only positive integers, find if the array can be partitioned into two
 * subsets such that the sum of elements in both subsets is equal.
 * <p>
 * Note:
 * Each of the array element will not exceed 100.
 * The array size will not exceed 200.
 */
public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length < 2) return false;
        int totalSum = 0;
        for (int n : nums) totalSum += n;

        if ((totalSum & 1) == 1) return false;

        totalSum /= 2;
        boolean[] dp = new boolean[totalSum + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int i = totalSum; i > 0; i--) {
                if (i >= num) {
                    dp[i] = dp[i] || dp[i - num];
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[totalSum];
    }

    private boolean canPartition(int[] nums, int index, int remained) {
        if (remained == 0) return true;
        if (remained < 0 || index == nums.length) return false;

        return canPartition(nums, index + 1, remained - nums[index])
                || canPartition(nums, index + 1, remained);
    }
}
