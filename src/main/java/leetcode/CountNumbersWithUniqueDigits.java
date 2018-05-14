package leetcode;

/**
 * 357. Count Numbers with Unique Digits
 * <p>
 * Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.
 * <p>
 * Example:
 * Given n = 2, return 91. (The answer should be the total numbers in the range of 0 ≤ x < 100,
 * excluding [11,22,33,44,55,66,77,88,99])
 */
public class CountNumbersWithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;

        int[] res = new int[n + 1];
        res[0] = 1;

        int sum = 1;
        int k = 9;
        for (int i = 1; i <= n && k > 0; i++) {
            if (i == 1) {
                res[i] += res[i - 1] * k;
            } else {
                res[i] += res[i - 1] * k--;
            }
            sum += res[i];
        }
        return sum;
    }
}
