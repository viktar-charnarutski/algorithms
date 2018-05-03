package leetcode;

import java.util.HashMap;

/**
 * 260. Single Number III
 * <p>
 * Given an array of numbers nums, in which exactly two elements appear only once and all
 * the other elements appear exactly twice. Find the two elements that appear only once.
 * <p>
 * For example:
 * <p>
 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 */
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {

        int[] resarr = new int[2];
        HashMap<Integer, Integer> nummap = new HashMap<>();

        for (int num : nums) {
            nummap.put(num, nummap.getOrDefault(num, 0) + 1);
        }

        int j = 0;
        for (int num : nummap.keySet()) {
            if (nummap.get(num) == 1) {
                resarr[j++] = num;
            }
        }

        return resarr;
    }
}
