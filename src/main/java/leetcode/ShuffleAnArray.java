package leetcode;

import java.util.Random;

/**
 * 384. Shuffle an Array
 */
public class ShuffleAnArray {

    private int[] nums;
    private Random rand;

    public ShuffleAnArray(int[] nums) {
        this.nums = nums;
        this.rand = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] res = nums.clone();
        for (int i = 0; i < res.length; i++) {
            swap(i, randInd(i, this.nums.length));
        }
        return res;
    }

    private void swap(int left, int right) {
        int tmp = this.nums[left];
        this.nums[left] = this.nums[right];
        this.nums[right] = tmp;
    }

    private int randInd(int min, int max) {
        return this.rand.nextInt(max - min) + min;
    }
}
