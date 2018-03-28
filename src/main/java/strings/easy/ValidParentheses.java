package strings.easy;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 * <p>
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> pars = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    pars.push(')');
                    break;
                case '{':
                    pars.push('}');
                    break;
                case '[':
                    pars.push(']');
                    break;
                default:
                    if (pars.empty() || c != pars.pop()) {
                        return false;
                    }
            }
        }
        return pars.empty();
    }
}
