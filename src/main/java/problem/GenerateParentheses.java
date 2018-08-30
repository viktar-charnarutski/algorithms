package problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 22. Generate Parentheses
 * <p>
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return Collections.emptyList();
        }
        List<String> res = new ArrayList<>();
        generateParenthesis(0, 0, "", res, n);
        return res;
    }

    private void generateParenthesis(int left, int right, String curr, List<String> res, int max) {
        if (curr.length() == max * 2) {
            res.add(curr);
            return;
        }
        if (left < max) {
            generateParenthesis(left + 1, right, curr + "(", res, max);
        }
        if (right < left) {
            generateParenthesis(left, right + 1, curr + ")", res, max);
        }
    }
}
