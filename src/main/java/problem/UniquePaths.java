package problem;

import java.util.Arrays;

/**
 * 62. Unique Paths
 * <p>
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * <p>
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * <p>
 * How many possible unique paths are there?
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] paths = new int[m][n];
        Arrays.fill(paths[0], 1);
        for (int i = 0; i < m; i++) {
            paths[i][0] = 1;
        }
        for (int col = 1; col < m; col++) {
            for (int row = 1; row < n; row++) {
                paths[col][row] = paths[col - 1][row] + paths[col][row - 1];
            }
        }

        return paths[m - 1][n - 1];
    }

    public int uniquePathsReqursion(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (m == 1 && n == 1) {
            return 1;
        }
        return uniquePathsReqursion(m, n - 1) + uniquePaths(m - 1, n);
    }
}
