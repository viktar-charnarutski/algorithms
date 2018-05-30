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
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= target)
                count += memo[target][i] != null ? memo[target][i] : combinationSum4(nums, target - nums[i]);
        }
        return count;
    }
}
