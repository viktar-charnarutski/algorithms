package problem;

/**
 * 416. Partition Equal Subset Sum
 * <p>
 * Given a non-empty array containing only positive integers, find if the array can be partitioned into two
 * subsets such that the sum of elements in both subsets is equal.
 * <p>
 * Note:
 * Each of the array element will not exceed 100.
 * The array size will not exceed 200.
 */
public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length < 2) return false;
        int totalSum = 0, currentSum = 0;
        for (int n : nums) totalSum += n;
        return canPartition(nums, 0, currentSum, totalSum);
    }

    private boolean canPartition(int[] nums, int index, int currentSum, int remainedSum) {
        if (currentSum == remainedSum) return true;
        if (remainedSum < currentSum || index == nums.length) return false;

        return canPartition(nums, index + 1, currentSum + nums[index], remainedSum - nums[index])
                || canPartition(nums, index + 1, currentSum, remainedSum);
    }
}
