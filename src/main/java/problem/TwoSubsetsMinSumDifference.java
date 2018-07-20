package problem;

import java.util.HashSet;

/**
 * Two Subsets Minimum Sum Difference
 * <p>
 * Given a set of integers, the task is to divide it into two sets S1 and S2
 * such that the absolute difference between their sums is minimum.
 * <p>
 * If there is a set S with n elements, then if we assume Subset1 has m elements,
 * Subset2 must have n-m elements and the value of abs(sum(Subset1) – sum(Subset2)) should be minimum.
 */
public class TwoSubsetsMinSumDifference {
    public int twoSubsetsMinSumDifference(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int totalSum = 0;
        for (int n : nums) {
            totalSum += n;
        }
        HashSet<Integer> sums = new HashSet<>();
        getAllSums(nums, 0, 0, sums);

        int minSum = Integer.MAX_VALUE;
        for (int sum1 : sums) {
            int sum2 = totalSum - sum1;
            minSum = Math.min(Math.abs(sum1 - sum2), minSum);
        }

        return minSum;
    }

    private void getAllSums(int[] nums, int currSum, int i, HashSet<Integer> sums) {
        if (i == nums.length) {
            sums.add(currSum);
            return;
        }
        getAllSums(nums, currSum + nums[i], i + 1, sums);
        getAllSums(nums, currSum, i + 1, sums);
    }
}
