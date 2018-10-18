package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * 264. Ugly Number II
 * <p>
 * Write a program to find the n-th ugly number.
 * <p>
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 */
public class UglyNumberII {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = Math.min(dp[i2] * 2, Math.min(dp[i3] * 3, dp[i5] * 5));
            if (dp[i] == dp[i2] * 2) i2++;
            if (dp[i] == dp[i3] * 3) i3++;
            if (dp[i] == dp[i5] * 5) i5++;
        }
        return dp[n - 1];
    }
}
