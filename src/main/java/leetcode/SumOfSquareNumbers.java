package leetcode;

/**
 * 633. Sum of Square Numbers
 * <p>
 * Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.
 */
public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        for (long i = 0; i * i <= c; i++) {
            double j = Math.sqrt(c - i * i);
            if (j == (int) j) return true;
        }
        return false;
    }
}
