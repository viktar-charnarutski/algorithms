package problem;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 219. Contains Duplicate II
 * <p>
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array
 * such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 */
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null) return false;

        HashSet<Integer> uniqNums = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!uniqNums.add(nums[i])) return true;

            if (uniqNums.size() > k) {
                uniqNums.remove(nums[i - k]);
            }
        }

        return false;
    }

    public boolean containsNearbyDuplicateHashMap(int[] nums, int k) {
        if (nums == null) return false;

        HashMap<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer ind = pos.get(nums[i]);
            if (ind != null && (i - ind) <= k) return true;

            pos.put(nums[i], i);
        }

        return false;
    }
}
