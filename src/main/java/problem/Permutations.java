package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. Permutations
 * <p>
 * Given a collection of distinct integers, return all possible permutations.
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, res, new ArrayList<>());
        return res;
    }

    private void backtrack(int[] nums, List<List<Integer>> res, List<Integer> perm) {
        if (perm.size() == nums.length) {
            res.add(new ArrayList<>(perm));
        } else {
            for (int num : nums) {
                if (perm.contains(num)) continue;
                perm.add(num);
                backtrack(nums, res, perm);
                perm.remove(perm.size() - 1);
            }
        }
    }
}
