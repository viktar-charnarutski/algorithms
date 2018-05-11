package leetcode;

import java.util.ArrayList;
import java.util.List;
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
        List<Integer> numsList = arrayAsList();
        int[] res = new int[nums.length];

        for (int i = 0; i < res.length; i++) {
            int randInx = this.rand.nextInt(numsList.size());
            res[i] = numsList.get(randInx);
            numsList.remove(randInx);
        }
        return res;
    }

    private List<Integer> arrayAsList() {
        ArrayList<Integer> numsList = new ArrayList<>();
        for (int num : this.nums) {
            numsList.add(num);
        }
        return numsList;
    }
}
