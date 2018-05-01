package leetcode;

/**
 * 695. Max Area of Island
 * <p>
 * Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
 * <p>
 * Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)
 */
public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int l = grid.length;
        int w = grid[0].length;

        int maxArea = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < w; j++) {
                if (grid[i][j] == 1) {
                    int curArea = dfs(grid, i, j, l, w, 0);
                    maxArea = Math.max(curArea, maxArea);
                }
            }
        }

        return maxArea;
    }

    private int dfs(int[][] grid, int i, int j, int l, int w, int curArea) {
        if (i < 0 || i >= l || j < 0 || j >= w || grid[i][j] == 0) {
            return curArea;
        }

        grid[i][j] = 0;
        curArea++;

        curArea = dfs(grid, i + 1, j, l, w, curArea);
        curArea = dfs(grid, i - 1, j, l, w, curArea);
        curArea = dfs(grid, i, j + 1, l, w, curArea);
        curArea = dfs(grid, i, j - 1, l, w, curArea);

        return curArea;
    }
}
