package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 697. Degree of an Array
 * <p>
 * Given a non-empty array of non-negative integers nums,
 * the degree of this array is defined as the maximum frequency of any one of its elements.
 * <p>
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums,
 * that has the same degree as nums.
 */
public class DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        HashMap<Integer, ArrayList<Integer>> repeats = new HashMap<>();
        int maxDegree = 0;
        int minSubArrayLength = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (repeats.containsKey(nums[i])) {
                ArrayList<Integer> indexes = repeats.get(nums[i]);
                indexes.add(i);
            } else {
                ArrayList<Integer> indexes = new ArrayList<>();
                indexes.add(i);
                repeats.put(nums[i], indexes);
            }
        }

        for (int i : repeats.keySet()) {
            ArrayList<Integer> indexes = repeats.get(i);
            if (indexes.size() > maxDegree) {
                maxDegree = indexes.size();
                minSubArrayLength = indexes.get(indexes.size() - 1) - indexes.get(0) + 1;
            } else if (indexes.size() == maxDegree) {
                minSubArrayLength = Math.min(indexes.get(indexes.size() - 1) - indexes.get(0) + 1, minSubArrayLength);
            }
        }
        return minSubArrayLength;
    }
}
