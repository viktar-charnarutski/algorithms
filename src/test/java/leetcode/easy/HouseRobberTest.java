package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class HouseRobberTest {

    @Test
    public void rob() {
        HouseRobber ins = new HouseRobber();
        int[] input = {20, 10, 5, 100, 50, 40, 80, 90};
        assertSame(240, ins.rob(input));
    }
}