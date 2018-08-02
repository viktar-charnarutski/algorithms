package problem;

import java.util.Stack;

/**
 * 678. Valid Parenthesis String
 * <p>
 * Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this
 * string is valid. We define the validity of a string by these rules:
 * <p>
 * Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 * Any right parenthesis ')' must have a corresponding left parenthesis '('.
 * Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 * '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
 * An empty string is also valid.
 */
public class ValidParenthesisString {
    public boolean checkValidString(String s) {
        if (s == null || s.length() == 0) return true;
        Stack<Character> stack = new Stack<>();
        int starsCount = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': {
                    stack.push(')');
                    break;
                }
                case ')': {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        if (starsCount-- == 0) {
                            return false;
                        }
                    }
                    break;
                }
                case '*': {
                    starsCount++;
                    break;
                }
            }
        }
        return stack.isEmpty() || starsCount >= stack.size();
    }
}
