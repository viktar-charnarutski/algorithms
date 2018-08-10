package problem;

import java.util.Arrays;

/**
 * 561. Array Partition I
 * <p>
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1),
 * (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length % 2 != 0) {
            return 0;
        }
        int res = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            res += nums[i];
        }
        return res;
    }
}
