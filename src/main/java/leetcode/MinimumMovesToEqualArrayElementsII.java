package leetcode;

import java.util.Arrays;

/**
 * 462. Minimum Moves to Equal Array Elements II
 *
 * Given a non-empty integer array, find the minimum number of moves required to make all array elements equal,
 * where a move is incrementing a selected element by 1 or decrementing a selected element by 1.
 *
 * You may assume the array's length is at most 10,000.
 */
public class MinimumMovesToEqualArrayElementsII {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        int steps = 0;

        while (left < right) {
            steps += nums[right] - nums[left];
            left++;
            right--;
        }

        return steps;
    }
}
