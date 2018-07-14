package problem;

/**
 * Triple Step
 * <p>
 * A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3
 * steps at a time. Implement a method to count how many possible ways the child can run up the
 * stairs.
 */
public class TripleStep {

    public int tripleStep(int n) {
        return count(n);
    }

    private int count(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        return count(n - 1) + count(n - 2) + count(n - 3);
    }
}
