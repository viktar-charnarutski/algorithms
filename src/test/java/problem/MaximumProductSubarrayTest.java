package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumProductSubarrayTest {

    @Test
    public void maxProduct1() {
        assertEquals(6, new MaximumProductSubarray().maxProduct(new int[]{2, 3, -2, 4}));
    }

    @Test
    public void maxProduct2() {
        assertEquals(0, new MaximumProductSubarray().maxProduct(new int[]{-1, 0, -2}));
    }
}