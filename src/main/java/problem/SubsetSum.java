package problem;

/**
 * Subset Sum
 * <p>
 * Given a set of non-negative integers, and a value sum,
 * determine if there is a subset of the given set with sum equal to given sum.
 */
public class SubsetSum {

    public boolean subsetSum(int[] nums, int sum) {
        return subsetSum(nums, sum, 0);
    }

    private boolean subsetSum(int[] nums, int sum, int i) {
        if (sum == 0) return true;
        if (i == nums.length) return false;
        return subsetSum(nums, sum, i + 1) || subsetSum(nums, sum - nums[i], i + 1);
    }
}
