package leetcode;

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

        for (int j = 0; j < grid.length; j++) {
            res[0][j] = j > 0 ? grid[0][j] + res[0][j - 1] : grid[0][j];
        }
        for (int j = 0; j < grid[0].length; j++) {
            res[j][0] = j > 0 ? grid[j][0] + res[j - 1][0] : grid[j][0];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                res[i][j] = Math.min(res[i][j - 1] + grid[i][j], res[i - 1][j] + grid[i][j]);
            }
        }
        return res[res.length - 1][res[0].length - 1];
    }
}
