package leetcode;

/**
 * 377. Combination Sum IV
 * <p>
 * Given an integer array with all positive numbers and no duplicates,
 * find the number of possible combinations that add up to a positive integer target.
 */
public class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        if (target == 0) return 1;
        int count = 0;
        for (int num : nums) {
            if (num <= target)
                count += combinationSum4(nums, target - num);
        }
        return count;
    }
}
