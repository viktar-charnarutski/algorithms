package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniquePathsIITest {

    @Test
    public void hasPath_true() {
        int[][] grid = new int[4][5];
        grid[0][3] = 1;
        grid[1][4] = 1;
        grid[2][1] = 1;
        grid[2][3] = 1;
        grid[3][1] = 1;
        assertEquals(2, new UniquePathsII().uniquePathsWithObstacles(grid));
    }

    @Test
    public void hasPath_false() {
        int[][] grid = new int[4][5];
        grid[0][3] = 1;
        grid[1][4] = 1;
        grid[2][1] = 1;
        grid[2][2] = 1;
        grid[2][3] = 1;
        grid[3][0] = 1;
        grid[3][1] = 1;
        assertEquals(0, new UniquePathsII().uniquePathsWithObstacles(grid));
    }
}