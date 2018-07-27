package problem;

import java.util.HashSet;

/**
 * 55. Jump Game
 * <p>
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Determine if you are able to reach the last index.
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length < 2) return true;
        return canJump(nums, 0, new HashSet<>());
    }

    private boolean canJump(int[] nums, int i, HashSet<String> memo) {
        if (i >= nums.length) {
            return false;
        }
        if (i == nums.length - 1) return true;
        if (nums[i] == 0) return false;

        String key = "" + nums[i] + i;
        if (memo.contains(key)) return false;

        for (int j = i + nums[i]; j > i; j--) {
            if (canJump(nums, j, memo)) {
                return true;
            }
        }
        memo.add(key);
        return false;
    }
}
