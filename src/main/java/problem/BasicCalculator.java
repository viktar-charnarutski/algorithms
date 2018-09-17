package problem;

import java.util.Stack;

/**
 * 224. Basic Calculator
 * <p>
 * Implement a basic calculator to evaluate a simple expression string.
 * <p>
 * The expression string may contain open ( and closing parentheses ), the plus + or minus sign -,
 * non-negative integers and empty spaces .
 */
public class BasicCalculator {
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;
        int sum = 0, sign = 1, num = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = 10 * num + ((int) c - '0');
            } else if (c == '+') {
                sum += sign * num;
                sign = 1;
                num = 0;
            } else if (c == '-') {
                sum += sign * num;
                sign = -1;
                num = 0;
            } else if (c == '(') {
                stack.push(sum);
                stack.push(sign);
                sum = 0;
                sign = 1;
            } else if (c == ')') {
                sum += sign * num;
                num = 0;
                sum *= stack.pop();
                sum += stack.pop();
            }
        }
        if (num != 0) {
            sum += sign * num;
        }
        return sum;
    }
}
