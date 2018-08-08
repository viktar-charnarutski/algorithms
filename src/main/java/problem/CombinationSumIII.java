package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * 216. Combination Sum III
 */
public class CombinationSumIII {
    private List<List<Integer>> res = new ArrayList<>();
    private int k, n;

    public List<List<Integer>> combinationSum3(int k, int n) {
        this.k = k;
        this.n = n;
        combinationSum3(1, n, new ArrayList<>());
        return res;
    }

    private void combinationSum3(int currNum, int remained, List<Integer> currSet) {
        if (currNum >= n) {
            return;
        }
        if (currSet.size() == k) {
            if (remained == 0) {
                res.add(new ArrayList<>(currSet));
            }
            return;
        }
        if (currNum > remained) {
            return;
        }

        currSet.add(currNum);
        combinationSum3(currNum + 1, remained - currNum, currSet);

        currSet.remove(currSet.size() - 1);
        combinationSum3(currNum + 1, remained, currSet);
    }
}
