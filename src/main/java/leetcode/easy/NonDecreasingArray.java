package leetcode.easy;

/**
 * 665. Non-decreasing Array
 * <p>
 * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
 * <p>
 * We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
 */
public class NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
        if (nums == null || nums.length <= 1) return true;

        boolean changed = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                if (changed) return false;
                else {
                    if (i - 2 >= 0 && nums[i] < nums[i - 2]) {
                        nums[i] = nums[i - 1];
                    }
                    changed = true;
                }
            }
        }

        return true;
    }
}
