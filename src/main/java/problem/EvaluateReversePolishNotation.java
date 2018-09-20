package problem;

import java.util.List;
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

    public double rpn (List<String> ops) {
        if (ops == null || ops.size() == 0) {
            throw new IllegalArgumentException("Argument is empty.");
        }
        Stack<Double> nums = new Stack<>();
        for (String op : ops) {
            try {
                nums.push(Double.parseDouble(op));
            } catch (NumberFormatException e) {
                calculate(nums, op);
            }
        }
        return nums.pop();
    }

    private void calculate (Stack<Double> nums, String op) {
        double a = nums.pop();
        double b = nums.pop();
        switch (op) { // +
            case "+":
                nums.push(a + b); // 1 + 4
                break;
            case "-":
                nums.push(b - a);
                break;
            case "*":
                nums.push(a * b);
                break;
            case "/":
                nums.push(a / b);
                break;
        }
    }
}
