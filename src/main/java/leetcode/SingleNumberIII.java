package leetcode;

/**
 * 260. Single Number III
 * <p>
 * Given an array of numbers nums, in which exactly two elements appear only once and all
 * the other elements appear exactly twice. Find the two elements that appear only once.
 * <p>
 * For example:
 * <p>
 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 */
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int[] diff = {0, 0};
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        // getting the last different bit
        xor &= -xor;

        for (int num : nums) {
            if ((xor & num) == 0) {
                diff[0] ^= num;
            } else {
                diff[1] ^= num;
            }
        }
        return diff;
    }
}
