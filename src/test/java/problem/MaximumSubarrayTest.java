package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class MaximumSubarrayTest {

    @Test
    public void maxSubArray_mixed() {
        MaximumSubarray ins = new MaximumSubarray();
        assertSame(6, ins.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    public void maxSubArray_all_negative() {
        MaximumSubarray ins = new MaximumSubarray();
        assertSame(-1, ins.maxSubArray(new int[]{-2, -1, -3, -4, -1, -2, -1, -5, -4}));
    }

    @Test
    public void maxSubArray_all_negative_one_positive() {
        MaximumSubarray ins = new MaximumSubarray();
        assertSame(4, ins.maxSubArray(new int[]{-2, -1, -3, -4, -1, -2, -1, -5, 4}));
    }

    @Test
    public void maxSubArray_empty() {
        MaximumSubarray ins = new MaximumSubarray();
        assertSame(0, ins.maxSubArray(new int[]{}));
    }

    @Test
    public void maxSubArray_null() {
        MaximumSubarray ins = new MaximumSubarray();
        assertSame(0, ins.maxSubArray(null));
    }

    @Test
    public void maxSubArray_max_int() {
        MaximumSubarray ins = new MaximumSubarray();
        assertEquals(Integer.MAX_VALUE, ins.maxSubArray(new int[]{Integer.MAX_VALUE, 1, 2, 3}));
    }
}