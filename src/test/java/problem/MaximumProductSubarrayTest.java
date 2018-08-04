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

    @Test
    public void maxProduct3() {
        assertEquals(18, new MaximumProductSubarray().maxProduct(new int[]{6, 3, -10, 0, 2}));
    }

    @Test
    public void maxProduct4() {
        assertEquals(2, new MaximumProductSubarray().maxProduct(new int[]{0, 2}));
    }
}