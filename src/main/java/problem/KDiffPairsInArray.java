package problem;

import java.util.HashMap;
import java.util.Map;

/**
 * 532. K-diff Pairs in an Array
 * <p>
 * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array.
 * Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their
 * absolute difference is k.
 */
public class KDiffPairsInArray {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length < 2 || k < 0) return 0;
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int firstNum : map.keySet()) {
            int secondNum = firstNum - k;
            if (map.containsKey(secondNum)) {
                if (k == 0) {
                    if (map.get(secondNum) > 1) count++;
                } else {
                    count++;

                }
            }
        }

        return count;
    }
}
