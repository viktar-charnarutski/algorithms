package problem;

/**
 * 263. Ugly Number
 * <p>
 * Write a program to check whether a given number is an ugly number.
 * <p>
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 */
public class UglyNumber {
    public boolean isUgly(int num) {
        if (num < 1) return false;
        num = divideBy(num, 2);
        num = divideBy(num, 3);
        num = divideBy(num, 5);
        return num == 1;
    }

    private int divideBy(int num, int divider) {
        while (num % divider == 0) num /= divider;
        return num;
    }
}
