package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubarrayProductLessThanKTest {

    @Test
    public void numSubarrayProductLessThanK1() {
        assertEquals(8,
                new SubarrayProductLessThanK().numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
    }

    @Test
    public void numSubarrayProductLessThanK2() {
        assertEquals(0,
                new SubarrayProductLessThanK().numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 1));
    }

    @Test
    public void numSubarrayProductLessThanK3() {
        assertEquals(0,
                new SubarrayProductLessThanK().numSubarrayProductLessThanK(new int[]{1,2,3}, 0));
    }

    @Test
    public void numSubarrayProductLessThanK4() {
        assertEquals(0,
                new SubarrayProductLessThanK().numSubarrayProductLessThanK(new int[]{1,2,3}, 0));
    }
}