package problem;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RobotInGridTest {

    @Test
    public void hasPath() {
        int[][] grid = new int[4][5];
        grid[0][3] = 1;
        grid[1][4] = 1;
        grid[2][1] = 1;
        grid[2][3] = 1;
        grid[3][1] = 1;

        assertTrue(new RobotInGrid().hasPath(grid));
    }
}