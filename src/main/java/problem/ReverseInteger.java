package problem;

/**
 * 7. Reverse Integer
 * <p>
 * Given a 32-bit signed integer, reverse digits of an integer.
 */
public class ReverseInteger {
    public int reverse(int x) {
        long reversed = 0;

        while (x != 0) {
            reversed = 10 * reversed + x % 10;
            x /= 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            reversed = 0;
        }

        return (int) reversed;
    }
}
