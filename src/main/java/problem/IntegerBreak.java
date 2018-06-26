package problem;

/**
 * 343. Integer Break
 * <p>
 * Given a positive integer n, break it into the sum of at least two positive integers
 * and maximize the product of those integers. Return the maximum product you can get.
 * <p>
 * For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 = 3 + 3 + 4).
 * <p>
 * Note: You may assume that n is not less than 2 and not larger than 58.
 */
public class IntegerBreak {
    public int integerBreak(int n) {
        if (n == 2 || n == 3) return n - 1;
        int sum = 1;
        int tmp = n;
        while (tmp > 4) {
            tmp -= 3;
            sum *= 3;
        }
        return sum * tmp;
    }
}
