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
        List<Integer> uglyNums = new ArrayList<>();
        uglyNums.add(1);
        int u2 = 2, u3 = 3, u5 = 5;
        for (int i = 1; i < n; i++) {
            int uMin = Math.min(u2, Math.min(u3, u5));
            uglyNums.add(uMin);
            if (u2 == uMin) {
                u2 += 2;
            }
            if (u3 == uMin) {
                u3 += 3;
            }
            if (u5 == uMin) {
                u5 += 5;
            }
        }
        return uglyNums.get(n - 1);
    }
}
