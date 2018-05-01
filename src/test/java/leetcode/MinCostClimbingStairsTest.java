package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class MinCostClimbingStairsTest {

    @Test
    public void minCostClimbingStairs() {
        MinCostClimbingStairs ins = new MinCostClimbingStairs();
        assertSame(15, ins.minCostClimbingStairs(new int[]{10, 15, 20}));
        assertSame(6, ins.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}