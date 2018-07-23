package problem;

/**
 * Optimal Strategy for a Game
 * <p>
 * Consider a row of n coins of values v1 . . . vn, where n is even.
 * We play a game against an opponent by alternating turns. In each turn, a player selects either
 * the first or last coin from the row, removes it from the row permanently, and receives the value of the coin.
 * <p>
 * Determine the maximum possible amount of money we can definitely win if we move first.
 */
public class OptimalStrategy {
    public int maxPossibleAmount(int[] nums) {
        return maxPossibleAmount(nums, 0, nums.length - 1, new Integer[nums.length][nums.length]);
    }

    private int maxPossibleAmount(int[] nums, int left, int right, Integer[][] memo) {
        if (left >= right) return 0;
        if (memo[left][right] != null) {
            return memo[left][right];
        }
        memo[left][right] = Math.max(
                nums[left] + Math.min(maxPossibleAmount(nums, left + 1, right - 1, memo),
                        maxPossibleAmount(nums, left + 2, right, memo)),

                nums[right] + Math.min(maxPossibleAmount(nums, left + 1, right - 1, memo),
                        maxPossibleAmount(nums, left, right - 2, memo))
        );

        return memo[left][right];
    }
}
