package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumPathSumTest {

    @Test
    public void minPathSum1() {
        int[][] m = new int[3][3];
        m[0][0] = 1;
        m[0][1] = 3;
        m[0][2] = 1;
        m[1][0] = 1;
        m[1][1] = 5;
        m[1][2] = 1;
        m[2][0] = 4;
        m[2][1] = 2;
        m[2][2] = 1;
        assertEquals(7, new MinimumPathSum().minPathSum(m));
    }
    @Test
    public void minPathSum2() {
        int[][] m = new int[2][3];
        m[0][0] = 1;
        m[0][1] = 3;
        m[0][2] = 5;
        m[1][0] = 3;
        m[1][1] = 2;
        m[1][2] = 1;
        assertEquals(7, new MinimumPathSum().minPathSum(m));
    }
}