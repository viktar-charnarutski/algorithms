package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> indexes = map.get(nums[i]);
            if (indexes == null) {
                indexes = new HashSet<>();
            }
            indexes.add(i);
            map.put(nums[i], indexes);
        }

        for (int firstNum : map.keySet()) {
            int secondNum = firstNum - k;
            if (k == 0) {
                Set<Integer> indexes = map.get(secondNum);
                if (indexes.size() > 1) count++;
            } else {
                if (map.containsKey(secondNum)) {
                    count++;
                }
            }
        }

        return count;
    }
}
