package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * Longest Increasing Subsequence
 * <p>
 * The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of
 * a given sequence such that all elements of the subsequence are sorted in increasing order.
 */
public class LongestIncreasingSubsequenceI {

    public int longestIncreasingSubsequence(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        ArrayList<Integer> seq = new ArrayList<>();
        for (int n : nums) {
            if (seq.isEmpty() || seq.get(seq.size() - 1) < n) {
                seq.add(n);
            } else {
                int ind = findInsertIndex(seq, n);
                seq.set(ind, n);
            }
        }
        return seq.size();
    }

    private int findInsertIndex(List<Integer> list, int target) {
        int lo = 0, hi = list.size() - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (target > list.get(mid)) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}
