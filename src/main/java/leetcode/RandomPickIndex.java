package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * 398. Random Pick Index
 * <p>
 * Given an array of integers with possible duplicates, randomly output the index of a given target number.
 * <p>
 * You can assume that the given target number must exist in the array.
 */
public class RandomPickIndex {

    private HashMap<Integer, List<Integer>> map;
    private Random rand;

    public RandomPickIndex(int[] nums) {
        this.rand = new Random();
        this.map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!this.map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
    }

    public int pick(int target) {
        List<Integer> list = this.map.get(target);
        int i = rand.nextInt(list.size());
        return list.get(i);
    }
}
