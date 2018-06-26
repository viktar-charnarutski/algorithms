package problem;

/**
 * 807. Max Increase to Keep City Skyline
 * <p>
 * In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there.
 * We are allowed to increase the height of any number of buildings, by any amount
 * (the amounts can be different for different buildings). Height 0 is considered to be a building as well.
 * <p>
 * At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom,
 * left, and right, must be the same as the skyline of the original grid. A city's skyline is the outer
 * contour of the rectangles formed by all the buildings when viewed from a distance. See the following example.
 * <p>
 * What is the maximum total sum that the height of the buildings can be increased?
 */
public class MaxIncreaseToKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rows = new int[grid.length];
        int[] cols = new int[grid[0].length];

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                rows[row] = Math.max(rows[row], grid[row][col]);
                cols[col] = Math.max(cols[col], grid[row][col]);
            }
        }

        int sum = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                sum += Math.min(rows[row], cols[col]) - grid[row][col];
            }
        }

        return sum;
    }
}
