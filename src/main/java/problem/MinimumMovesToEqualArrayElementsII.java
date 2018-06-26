package problem;

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
        if(nums.length < 2) {return 0;}

        Arrays.sort(nums);
        int mid = nums[nums.length / 2];
        int steps = 0;

        for (int num : nums) {
            steps += Math.abs(mid - num);
        }

        return steps;
    }

    public int minMoves2Orig(int[] nums) {
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
