package problem;

/**
 * Recursive Multiply
 * <p>
 * Write a recursive function to multiply two positive integers without using the *operator.
 * You can use addition, subtraction, and bit shifting, but you should minimize the number of those operations.
 */
public class RecursiveMultiply {
    public int multiply(int num, int mult) {
        if (num == 0 || mult == 0) return 0;
        return multiply(num, mult, 0);
    }

    private int multiply(int num, int mult, int sum) {
        if (mult == 0) return sum;
        sum += num;
        mult--;
        return multiply(num, mult, sum);
    }
}
