package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. Subsets
 * <p>
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 * <p>
 * Note: The solution set must not contain duplicate subsets.
 */
public class Subsets {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        subsets(nums, new Integer[nums.length], 0);
        return list;
    }

    private void subsets(int[] nums, Integer[] subset, int i) {
        if (i == subset.length) {
            ArrayList<Integer> subsetList = new ArrayList<>();
            for (Integer num : subset) {
                if (num != null) subsetList.add(num);
            }
            list.add(subsetList);
            return;
        }
        subset[i] = nums[i];
        subsets(nums, subset, i + 1);
        subset[i] = null;
        subsets(nums, subset, i + 1);
    }
}
