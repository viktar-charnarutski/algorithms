package problem;

import java.util.Stack;

/**
 * Bracket Validator
 * <p>
 * You're working with an intern that keeps coming to you with JavaScript code that won't run because the braces,
 * brackets, and parentheses are off. To save you both some time, you decide to write a braces/brackets/parentheses
 * validator.
 */
public class BracketValidator {
    public boolean isValid(String parentheses) {
        if (parentheses == null || parentheses.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < parentheses.length(); i++) {
            char par = parentheses.charAt(i);
            switch (par) {
                case '(':
                    stack.push(')');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                default:
                    if (stack.isEmpty() || stack.pop() != par) {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
}
