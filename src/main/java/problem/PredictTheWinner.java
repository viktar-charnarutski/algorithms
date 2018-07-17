package problem;

/**
 * 486. Predict the Winner
 * <p>
 * Given an array of scores that are non-negative integers. Player 1 picks one of the numbers from either end of
 * the array followed by the player 2 and then player 1 and so on. Each time a player picks a number,
 * that number will not be available for the next player. This continues until all the scores have been chosen.
 * The player with the maximum score wins.
 * <p>
 * Given an array of scores, predict whether player 1 is the winner.
 * You can assume each player plays to maximize his score.
 * <p>
 * Note:
 * - 1 <= length of the array <= 20.
 * - Any scores in the given array are non-negative integers and will not exceed 10,000,000.
 * - If the scores of both players are equal, then player 1 is still the winner.
 */
public class PredictTheWinner {
    public boolean predictTheWinner(int[] nums) {
        return predictTheWinner(nums, 0, nums.length - 1) >= 0;
    }

    private int predictTheWinner(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        return Math.max(nums[left] - predictTheWinner(nums, left + 1, right),
                nums[right] - predictTheWinner(nums, left, right - 1));
    }
}
