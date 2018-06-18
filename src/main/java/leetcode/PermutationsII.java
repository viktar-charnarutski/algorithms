package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 47. Permutations II
 * <p>
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 */
public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, res, new ArrayList<>());
        return res;
    }

    private void backtrack(int[] nums, boolean[] used, List<List<Integer>> res, ArrayList<Integer> curr) {
        if (curr.size() == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            curr.add(nums[i]);
            backtrack(nums, used, res, curr);
            used[i] = false;
            curr.remove(curr.size() - 1);
        }

    }
}
