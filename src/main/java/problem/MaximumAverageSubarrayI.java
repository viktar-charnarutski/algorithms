package problem;

/**
 * 643. Maximum Average Subarray I
 * <p>
 * Given an array consisting of n integers, find the contiguous subarray of given length k that has
 * the maximum average value. And you need to output the maximum average value.
 */
public class MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];

        }

        int max = sum;

        for (int i = 0, j = k; j < nums.length; i++, j++) {
            sum = sum - nums[i] + nums[j];
            max = Math.max(sum, max);

        }
        return ((double) max) / ((double) k);
    }
}
