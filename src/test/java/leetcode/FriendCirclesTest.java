package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FriendCirclesTest {

    @Test
    public void findCircleNum() {
        int[][] input = new int[3][3];
        input[0][0] = 1;
        input[0][1] = 1;
        input[0][2] = 0;
        input[1][0] = 1;
        input[1][1] = 1;
        input[1][2] = 0;
        input[2][0] = 0;
        input[2][1] = 0;
        input[2][2] = 1;

        assertEquals(2, new FriendCircles().findCircleNum(input));
    }
    @Test
    public void findCircleNum1() {
        int[][] input = new int[3][3];
        input[0][0] = 1;
        input[0][1] = 1;
        input[0][2] = 0;
        input[1][0] = 1;
        input[1][1] = 1;
        input[1][2] = 1;
        input[2][0] = 0;
        input[2][1] = 1;
        input[2][2] = 1;

        assertEquals(1, new FriendCircles().findCircleNum(input));
    }
}