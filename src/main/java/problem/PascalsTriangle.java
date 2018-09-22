package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 * <p>
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> curr = new ArrayList<>();
        curr.add(1);
        res.add(new ArrayList<>(curr));
        if (numRows == 1) return res;

        numRows -= 1;
        List<Integer> prev = curr;
        while (numRows-- > 0) {
            curr = new ArrayList<>();
            curr.add(1);
            for (int i = 1; i < prev.size(); i++) {
                curr.add(prev.get(i - 1) + prev.get(i));
            }
            curr.add(1);
            res.add(curr);
            prev = curr;
        }
        return res;
    }
}
