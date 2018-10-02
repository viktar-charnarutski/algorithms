package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfSubarrayMinimumsTest {

    @Test
    public void sumSubarrayMins() {
        assertEquals(17, new SumOfSubarrayMinimums().sumSubarrayMins(new int[]{3, 1, 2, 4}));
    }
}