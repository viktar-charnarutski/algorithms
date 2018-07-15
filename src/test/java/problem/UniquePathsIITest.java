package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniquePathsIITest {

    @Test
    public void hasPath1() {
        int[][] grid = new int[4][5];
        grid[0][3] = 1;
        grid[1][4] = 1;
        grid[2][1] = 1;
        grid[2][3] = 1;
        grid[3][1] = 1;
        assertEquals(3
                , new UniquePathsII().uniquePathsWithObstacles(grid));
    }

    @Test
    public void hasPath2() {
        int[][] grid = new int[1][1];
        assertEquals(1, new UniquePathsII().uniquePathsWithObstacles(grid));
    }

    @Test
    public void hasPath3() {
        int[][] grid = new int[1][1];
        grid[0][0] = 0;
        assertEquals(1, new UniquePathsII().uniquePathsWithObstacles(grid));
    }

    @Test
    public void hasPath4() {
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

    @Test
    public void hasPath5() {
        int[][] grid = new int[1][2];
        grid[0][0] = 1;
        grid[0][1] = 0;
        assertEquals(0, new UniquePathsII().uniquePathsWithObstacles(grid));
    }
}