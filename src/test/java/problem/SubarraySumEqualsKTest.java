package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubarraySumEqualsKTest {

    @Test
    public void subarraySum1() {
        assertEquals(2, new SubarraySumEqualsK().subarraySum(new int[]{1, 1, 1}, 2));
    }

    @Test
    public void subarraySum2() {
        assertEquals(55, new SubarraySumEqualsK().subarraySum(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 0));
    }

    @Test
    public void subarraySum3() {
        assertEquals(4, new SubarraySumEqualsK().subarraySum(new int[]{3, 4, 7, 2, -3, 1, 4, 2}, 7));
    }
}