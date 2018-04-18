package leetcode.easy;

import java.util.HashSet;

/**
 * 202. Happy Number
 * <p>
 * Write an algorithm to determine if a number is "happy".
 * <p>
 * A happy number is a number defined by the following process: Starting with any positive integer,
 * replace the number by the sum of the squares of its digits, and repeat the process until the number
 * equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * <p>
 * Those numbers for which this process ends in 1 are happy numbers.
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        return isHappy(n, new HashSet<>());
    }

    private boolean isHappy(int n, HashSet<Integer> sums) {
        if (n == 1) return true;

        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }

        if (!sums.add(sum)) {
            return false;
        }

        return isHappy(sum, sums);
    }
}
