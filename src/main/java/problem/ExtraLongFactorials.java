package problem;

import java.math.BigInteger;

/**
 * Extra Long Factorials
 * <p>
 * The factorial of the integer n, written n!, is defined as:
 * <p>
 * f(n) = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1
 *
 * Calculate and print the factorial of a given integer.
 */
public class ExtraLongFactorials {
    static String extraLongFactorials(int n) {
        return factorial(n).toString();
    }

    static BigInteger factorial(int n) {
        if (n == 0) {
            return new BigInteger("1");
        }
        return factorial(n - 1).multiply(BigInteger.valueOf(n));
    }
}
