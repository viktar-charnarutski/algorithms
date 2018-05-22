package leetcode;

/**
 * 494. Target Sum
 * <p>
 * You are given a list of non-negative integers, a1, a2, ..., an, and a target, S.
 * Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.
 * <p>
 * Find out how many ways to assign symbols to make sum of integers equal to target S.
 */
public class TargetSum {
    private int count;

    public int findTargetSumWays(int[] nums, int S) {
        count(nums, S, 0, 0);
        return count;
    }

    private void count(int[] nums, int targetSum, int i, int currSumm) {
        if (i == nums.length) {
            if (currSumm == targetSum) {
                count++;
            }
            return;
        }

        count(nums, targetSum, i + 1, currSumm + nums[i]);
        count(nums, targetSum, i + 1, currSumm - nums[i]);

    }
}
