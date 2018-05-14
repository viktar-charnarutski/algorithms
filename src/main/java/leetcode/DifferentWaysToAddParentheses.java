package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 241. Different Ways to Add Parentheses
 * <p>
 * Given a string of numbers and operators, return all possible results from computing all the different
 * possible ways to group numbers and operators. The valid operators are +, - and *.
 */
public class DifferentWaysToAddParentheses {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '-' || c == '+' || c == '*') {
                List<Integer> list1 = diffWaysToCompute(input.substring(0, i));
                List<Integer> list2 = diffWaysToCompute(input.substring(i + 1));

                for (int m : list1) {
                    for (int n : list2) {
                        if (c == '+') res.add(m + n);
                        else if (c == '-') res.add(m - n);
                        else if (c == '*') res.add(m * n);
                    }
                }
            }
        }

        if (res.isEmpty()) res.add(Integer.valueOf(input));
        return res;
    }
}
