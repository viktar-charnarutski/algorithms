package leetcode.easy;

import java.util.Arrays;

/**
 * 645. Set Mismatch
 *
 * The set S originally contains numbers from 1 to n. But unfortunately, due to the data error,
 * one of the numbers in the set got duplicated to another number in the set, which results in repetition
 * of one number and loss of another number.
 *
 * Given an array nums representing the data status of this set after the error. Your task is to firstly
 * find the number occurs twice and then find the number that is missing. Return them in the form of an array.
 */
public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int dup = -1;
        int missed = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                dup = nums[i];
            } else if (nums[i] > nums[i - 1] + 1) {
                missed = nums[i - 1] + 1;
            }
        }
        return new int[]{dup, nums[nums.length - 1] != nums.length ? nums.length : missed};
    }
}
