package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 78. Subsets
 * <p>
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 * <p>
 * Note: The solution set must not contain duplicate subsets.
 */
public class Subsets {
    public List<List<Integer>> subsetsItr(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int num : nums) {
            List<List<Integer>> snapshot = new ArrayList<>();
            for (List<Integer> curr : res) {
                List<Integer> tmp = new ArrayList<>(curr);
                tmp.add(num);
                snapshot.add(tmp);
            }
            res.addAll(snapshot);
        }
        return res;
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> list, ArrayList<Integer> curr, int[] nums, int ind) {
        list.add(new ArrayList<>(curr));
        for (int i = ind; i < nums.length; i++) {
            curr.add(nums[i]);
            backtrack(list, curr, nums, i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}
