package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TargetSumTest {

    @Test
    public void findTargetSumWays1() {
        assertEquals(5, new TargetSum().findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }
    @Test
    public void findTargetSumWays2() {
        assertEquals(1, new TargetSum().findTargetSumWays(new int[]{1000}, -1000));
    }
}