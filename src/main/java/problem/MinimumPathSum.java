package problem;

/**
 * 64. Minimum Path Sum
 * <p>
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which
 * minimizes the sum of all numbers along its path.
 * <p>
 * Note: You can only move either down or right at any point in time.
 * <p>
 * Example:
 * <p>
 * Input:
 * [
 * [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * Output: 7
 * Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int[][] res = new int[grid.length][grid[0].length];

        for (int row = 0; row < grid.length; row++) {
            res[row][0] = row > 0 ? grid[row][0] + res[row - 1][0] : grid[row][0];
        }
        for (int col = 0; col < grid[0].length; col++) {
            res[0][col] = col > 0 ? grid[0][col] + res[0][col - 1] : grid[0][col];
        }

        for (int row = 1; row < grid.length; row++) {
            for (int col = 1; col < grid[0].length; col++) {
                res[row][col] = Math.min(res[row][col - 1] + grid[row][col], res[row - 1][col] + grid[row][col]);
            }
        }
        return res[res.length - 1][res[0].length - 1];
    }
}
