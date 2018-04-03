package strings.easy;

/**
 * 463. Island Perimeter
 * <p>
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water,
 * and there is exactly one island (i.e., one or more connected land cells).
 * The island doesn't have "lakes" (water inside that isn't connected to the water around the island).
 * One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100.
 * Determine the perimeter of the island.
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int lands = 0;
        int neighbors = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    lands++;
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                        neighbors++;
                    }
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) {
                        neighbors++;
                    }
                }
            }
        }
        return lands * 4 - neighbors * 2;
    }

    public int islandPerimeterSlow(int[][] grid) {
        int res = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    res += shoreValue(grid, i, j);
                }
            }
        }
        return res;
    }

    private static int shoreValue(int[][] grid, int i, int j) {
        return leftShoreValue(grid, i, j)
                + upShoreValue(grid, i, j)
                + rightShoreValue(grid, i, j)
                + downShoreValue(grid, i, j);
    }

    private static int leftShoreValue(int[][] grid, int i, int j) {
        return (j == 0 || grid[i][j - 1] == 0) ? 1 : 0;
    }

    private static int upShoreValue(int[][] grid, int i, int j) {
        return (i == 0 || grid[i - 1][j] == 0) ? 1 : 0;
    }

    private static int rightShoreValue(int[][] grid, int i, int j) {
        return (j == grid[i].length - 1 || grid[i][j + 1] == 0) ? 1 : 0;
    }

    private static int downShoreValue(int[][] grid, int i, int j) {
        return (i == grid.length - 1 || grid[i + 1][j] == 0) ? 1 : 0;
    }
}
