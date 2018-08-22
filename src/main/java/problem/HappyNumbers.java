package problem;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. Happy Number
 *
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process: Starting with any positive integer,
 * replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1
 * (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process
 * ends in 1 are happy numbers.
 */
public class HappyNumbers {
    public boolean isHappyNumber(int n) {
        if (n == 0 || n == 1) {
            return true;
        }
        Set<Integer> seen = new HashSet<>();
        while (true) {
            if (!seen.add(n)) {
                return false;
            }
            int sum = 0;
            while (n != 0) {
                int r = n % 10;
                sum += r * r;
                n /= 10;
            }
            if (sum == 1) {
                return true;
            }
            n = sum;
        }
    }
}
