package leetcode.easy;

/**
 * 367. Valid Perfect Square
 * <p>
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 * <p>
 * Note: Do not use any built-in library function such as sqrt.
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int i = 1;

        while (num > 0) {
            num -= i;
            i +=2;
        }

        return num == 0;
    }
}
