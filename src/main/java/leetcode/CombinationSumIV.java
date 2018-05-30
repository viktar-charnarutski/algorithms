package leetcode;

import java.util.Arrays;

/**
 * 377. Combination Sum IV
 * <p>
 * Given an integer array with all positive numbers and no duplicates,
 * find the number of possible combinations that add up to a positive integer target.
 */
public class CombinationSumIV {

    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        int[] res = new int[target + 1];
        res[0] = 1;
        for (int i = 0; i < res.length; i++) {
            for (int num : nums) {
                if (num > i) {
                    break;
                } else {
                    res[i] += res[i - num];
                }
            }
        }
        return res[target];
    }
}
