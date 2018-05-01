package leetcode;

/**
 * 303. Range Sum Query - Immutable
 * <p>
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 */
public class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) return nums[j];
        return nums[j] - nums[i - 1];
    }
}
