package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class MinimumNumberOfArrowsToBurstBalloonsTest {

    @Test
    public void findMinArrowShots() {
        int[][] input = new int[4][2];
        input[0][0] = 10;
        input[0][1] = 16;
        input[1][0] = 2;
        input[1][1] = 8;
        input[2][0] = 1;
        input[2][1] = 6;
        input[3][0] = 7;
        input[3][1] = 12;
        assertSame(2, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(input));
    }
}