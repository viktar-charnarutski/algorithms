package leetcode;

import java.util.Random;

/**
 * 398. Random Pick Index
 * <p>
 * Given an array of integers with possible duplicates, randomly output the index of a given target number.
 * <p>
 * You can assume that the given target number must exist in the array.
 */
public class RandomPickIndex {

    private int[] nums;
    private Random rand;

    public RandomPickIndex(int[] nums) {
        this.rand = new Random();
        this.nums = nums;
    }

    public int pick(int target) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < this.nums.length; i++) {
            if (this.nums[i] == target) {
                count++;
                res = rand.nextInt(count) == 0 ? i : res;
            }
        }
        return res;
    }
}
