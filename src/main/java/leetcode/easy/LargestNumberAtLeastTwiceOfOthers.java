package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 747. Largest Number At Least Twice of Others
 * <p>
 * In a given integer array nums, there is always exactly one largest element.
 * <p>
 * Find whether the largest element in the array is at least twice as much as every other number in the array.
 * <p>
 * If it is, return the index of the largest element, otherwise return -1.
 */
public class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) return 0;
        int ind = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[ind]) {
                ind = i;
            }
        }

        for (int num : nums) {
            if (num < nums[ind] && (num * 2) > nums[ind]) {
                return -1;
            }
        }

        return ind;
    }

    public int dominantIndexHAshMap(int[] nums) {
        if (nums.length == 1) return 0;

        HashMap<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            pos.put(nums[i], i);
        }

        Arrays.sort(nums);

        int largestNum = nums[nums.length - 1];
        int nextToLargestNum = nums[nums.length - 2];
        if (nextToLargestNum != 0 && (largestNum / nextToLargestNum) < 2 || largestNum == 0) {
            return -1;
        }

        return pos.get(largestNum);
    }
}
