package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnapsackProblemTest {

    @Test
    public void maxValue() {
        assertEquals(220, new KnapsackProblem().maxValue(new int[]{60, 100, 120}, new int[]{10, 20, 30}, 50));
    }
}