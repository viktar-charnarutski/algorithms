package problem;

/**
 * 740. Delete and Earn
 *
 * Given an array nums of integers, you can perform operations on the array.
 *
 * In each operation, you pick any nums[i] and delete it to earn nums[i] points.
 * After, you must delete every element equal to nums[i] - 1 or nums[i] + 1.
 *
 * You start with 0 points. Return the maximum number of points you can earn by applying such operations.
 */
public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        int range = 10001;
        int[] values = new int[range];
        for (int num : nums) values[num] += num;

        for (int i = 2; i < range; i++) {
            values[i] = Math.max(values[i - 1], values[i - 2] + values[i]);
        }
        return values[range - 1];
    }

    public int deleteAndEarn1(int[] nums) {
        int range = 10001;
        int[] values = new int[range];
        for (int num : nums) values[num] += num;

        int take = 0;
        int skip = 0;
        for (int i = 0; i < range; i++) {
            int currtake = skip + values[i];
            int currskip = Math.max(skip, take);
            take = currtake;
            skip = currskip;
        }
        return Math.max(take, skip);
    }
}
