package leetcode.easy;

/**
 * 633. Sum of Square Numbers
 *
 * Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.
 */
public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        for (long i = 0; c >= i * i; i++) {
            long iSqr = i * i;
            for (long j = 0; c >= j * j; j++) {
                if (iSqr + j * j == c) return true;
            }
        }
        return false;
    }
}
