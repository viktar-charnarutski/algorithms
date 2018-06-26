package problem;

/**
 * 494. Target Sum
 * <p>
 * You are given a list of non-negative integers, a1, a2, ..., an, and a target, S.
 * Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.
 * <p>
 * Find out how many ways to assign symbols to make sum of integers equal to target S.
 */
public class TargetSum {
    public int findTargetSumWays(int[] nums, int S) {
        int[][] memo = new int[nums.length][2001];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 2001; j++) {
                memo[i][j] = Integer.MIN_VALUE;
            }
        }
        return count(nums, S, 0, 0, memo);
    }

    private int count(int[] nums, int targetSum, int i, int currSumm, int[][] memo) {
        if (i == nums.length) {
            if (currSumm == targetSum) {
                return 1;
            }
            return 0;
        }

        if (memo[i][currSumm + 1000] != Integer.MIN_VALUE) {
            return memo[i][currSumm + 1000];
        }

        int plus = count(nums, targetSum, i + 1, currSumm + nums[i], memo);
        int minus = count(nums, targetSum, i + 1, currSumm - nums[i], memo);
        memo[i][currSumm + 1000] = plus + minus;

        return memo[i][currSumm + 1000];
    }
}
