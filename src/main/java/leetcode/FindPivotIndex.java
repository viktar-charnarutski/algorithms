package leetcode;

/**
 * 724. Find Pivot Index
 * <p>
 * Given an array of integers nums, write a method that returns the "pivot" index of this array.
 * <p>
 * We define the pivot index as the index where the sum of the numbers to the left of the index is equal
 * to the sum of the numbers to the right of the index.
 * <p>
 * If no such index exists, we should return -1. If there are multiple pivot indexes, you should return
 * the left-most pivot index.
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) return -1;

        int sum = 0;
        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }

        return -1;
    }
}
