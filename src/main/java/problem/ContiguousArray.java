package problem;

import java.util.HashMap;

/**
 * 525. Contiguous Array
 * <p>
 * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
 */
public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int max = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                count--;
            }
            if (map.containsKey(count)) {
                max = Math.max(i - map.get(count), max);
            } else {
                map.put(count, i);
            }
        }
        return max;
    }
}
