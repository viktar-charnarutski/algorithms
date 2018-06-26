package problem;

import java.util.Arrays;

/**
 * 581. Shortest Unsorted Continuous Subarray
 * <p>
 * Given an integer array, you need to find one continuous subarray that if you only sort this subarray
 * in ascending order, then the whole array will be sorted in ascending order, too.
 * <p>
 * You need to find the shortest such subarray and output its length.
 */
public class ShortestUnsortedContinuousSubarray {

    public int findUnsortedSubarray(int[] nums) {
        int[] clone = nums.clone();
        Arrays.sort(clone);
        int left = 0;
        int right = nums.length - 1;


        while (left < nums.length && nums[left] == clone[left]) left++;

        while (right > left && nums[right] == clone[right]) right--;

        return right - left + 1;
    }
}
