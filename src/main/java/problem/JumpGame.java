package problem;

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

        boolean[] memo = new boolean[nums.length];
        memo[nums.length - 1] = true;

        for (int i = nums.length - 2; i >= 0; i--) {
            int maxStep = Math.min(i + nums[i], nums.length - 1);
            for (int j = maxStep; j >= i; j--) {
                if (memo[j]) {
                    memo[i] = true;
                    break;
                }
            }
        }

        return memo[0];
    }
}
