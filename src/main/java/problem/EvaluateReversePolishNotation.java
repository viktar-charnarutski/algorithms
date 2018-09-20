package problem;

import java.util.Stack;

/**
 * 150. Evaluate Reverse Polish Notation
 * <p>
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * <p>
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 * <p>
 * Note:
 * <p>
 * Division between two integers should truncate toward zero.
 * The given RPN expression is always valid. That means the expression would always evaluate to a result and there
 * won't be any divide by zero operation.
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            return 0;
        }
        Stack<Integer> nums = new Stack<>();
        int a, b;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    a = nums.pop();
                    b = nums.pop();
                    nums.push(a + b);
                    break;
                case "-":
                    a = nums.pop();
                    b = nums.pop();
                    nums.push(b - a);
                    break;
                case "*":
                    a = nums.pop();
                    b = nums.pop();
                    nums.push(a * b);
                    break;
                case "/":
                    a = nums.pop();
                    b = nums.pop();
                    nums.push(b / a);
                    break;
                default:
                    nums.push(Integer.parseInt(token));
            }
        }
        return nums.pop();
    }
}
