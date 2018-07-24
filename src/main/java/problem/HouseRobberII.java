package problem;

/**
 * 213. House Robber II
 * <p>
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
 * stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last
 * one. Meanwhile, adjacent houses have security system connected and it will automatically contact the police if two
 * adjacent houses were broken into on the same night.
 * <p>
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount
 * of money you can rob tonight without alerting the police.
 */
public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
    }

    public int rob(int[] nums, int lo, int hi) {
        int prev = 0, preprev = 0;
        for (int i = lo; i < hi; i++) {

            int curr = preprev + nums[i];
            preprev = prev;
            prev = Math.max(prev, curr);
        }
        return preprev > prev ? preprev : prev;
    }
}
