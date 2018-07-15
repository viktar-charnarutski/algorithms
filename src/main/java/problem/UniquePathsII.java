package problem;

/**
 * 63. Unique Paths II
 * <p>
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * <p>
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * <p>
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * <p>
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * <p>
 * Note: m and n will be at most 100.
 */
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }

        int rowsAmount = obstacleGrid.length;
        int colsAmount = obstacleGrid[0].length;

        int[][] paths = new int[rowsAmount][colsAmount];
        if (obstacleGrid[0][0] == 0) {
            paths[0][0] = 1;
        } else {
            return 0;
        }

        fillFirstRow(obstacleGrid, paths);
        fillFirstCol(obstacleGrid, paths);

        for (int row = 1; row < rowsAmount; row++) {
            for (int col = 1; col < colsAmount; col++) {
                if (obstacleGrid[row][col] == 1) {
                    paths[row][col] = 0;
                } else {
                    paths[row][col] = paths[row - 1][col] + paths[row][col - 1];
                }
            }
        }

        return paths[rowsAmount - 1][colsAmount - 1];
    }

    private void fillFirstCol(int[][] grid, int[][] paths) {
        for (int row = 1; row < grid.length; row++) {
            if (grid[row][0] == 1) {
                break;
            }
            paths[row][0] = 1;
        }
    }

    private void fillFirstRow(int[][] grid, int[][] paths) {
        for (int col = 1; col < grid[0].length; col++) {
            if (grid[0][col] == 1) {
                break;
            }
            paths[0][col] = 1;
        }
    }
}
