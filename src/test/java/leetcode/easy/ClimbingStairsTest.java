package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class ClimbingStairsTest {

    @Test
    public void climbStairs() {
        ClimbingStairs ins = new ClimbingStairs();
        assertSame(2, ins.climbStairs(2));
        assertSame(3, ins.climbStairs(3));
    }
}