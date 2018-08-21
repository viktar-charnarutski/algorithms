package problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 77. Combinations
 *
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * 4, 2
 *
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        if (n == 0 || k == 0) {
            return Collections.emptyList();
        }
        List<List<Integer>> res = new ArrayList<>();
        combine(n, k, 1, res, new ArrayList<>());
        return res;
    }

    private void combine(int n, int k, int i, List<List<Integer>> res, List<Integer> curr) {
        if (k == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int j = i; j <= n; j++) {
            curr.add(i);
            combine(n, k - 1, j + 1, res, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
