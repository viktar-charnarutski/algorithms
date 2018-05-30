package leetcode;

/**
 * 377. Combination Sum IV
 * <p>
 * Given an integer array with all positive numbers and no duplicates,
 * find the number of possible combinations that add up to a positive integer target.
 */
public class CombinationSumIV {

    private Integer[] memo;

    public int combinationSum4(int[] nums, int target) {
        memo = new Integer[target + 1];
        memo[0] = 1;
        return combination(nums, target);
    }

    public int combination(int[] nums, int target) {
        if (memo[target] != null) return memo[target];
        int count = 0;
        for (int num : nums) {
            if (num <= target)
                count += combination(nums, target - num);
        }
        return count;
    }
}
