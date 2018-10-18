package problem;

/**
 * 921. Minimum Add to Make Parentheses Valid
 * <p>
 * Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any
 * positions ) so that the resulting parentheses string is valid.
 * <p>
 * Formally, a parentheses string is valid if and only if:
 * <p>
 * It is the empty string, or
 * It can be written as AB (A concatenated with B), where A and B are valid strings, or
 * It can be written as (A), where A is a valid string.
 * Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.
 */
public class MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String S) {
        int open = 0, closed = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    closed++;
                }
            }
        }
        return open + closed;
    }
}
