package leetcode.easy;

/**
 * 326. Power of Three
 * <p>
 * Given an integer, write a function to determine if it is a power of three.
 * <p>
 * Follow up:
 * Could you do it without using any loop / recursion?
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1_162_261_467 % n == 0;
    }
}
