package leetcode;

/**
 * 136. Single Number
 * <p>
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int one = nums[0];
        for (int i = 1; i < nums.length; i++) {
            one ^= nums[i];
        }
        return one;
    }
}
