package leetcode;

/**
 * 377. Combination Sum IV
 * <p>
 * Given an integer array with all positive numbers and no duplicates,
 * find the number of possible combinations that add up to a positive integer target.
 */
public class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        return combinationSum4(nums, target, new Integer[target + 1][nums.length + 1]);
    }

    public int combinationSum4(int[] nums, int target, Integer[][] memo) {
        if (target == 0) return 1;
        int count = 0;
        for (int num : nums) {
            if (num <= target)
                count += memo[target][num] != null ? memo[target][num] : combinationSum4(nums, target - num);
        }
        return count;
    }
}
