package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPathInMatrixTest {

    @Test
    public void longestPathInMatrix() {
        int[][] grid = new int[3][3];
        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[0][2] = 9;
        grid[1][0] = 5;
        grid[1][1] = 3;
        grid[1][2] = 8;
        grid[2][0] = 4;
        grid[2][1] = 6;
        grid[2][2] = 7;
        assertEquals(4, new LongestPathInMatrix().longestPathInMatrix(grid));
    }
}