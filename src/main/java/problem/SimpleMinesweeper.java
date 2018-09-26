package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Simple Minesweeper
 * <p>
 * Given a 2D matrix with 'bombs' - cells marked with '1', and empty spaces - cells marked with '0'.
 * Find all bomb clusters which are being formed with cells of '1' connected by sides.
 * <p>
 * Example:
 * <p>
 * Grid:
 * [0, 1, 0, 1],
 * [0, 1, 1, 1],
 * [0, 0, 0, 0],
 * [0, 1, 0, 0]
 * <p>
 * Result:
 * {[0,1], [0,3], [1,1], [1,2], [1,3]},
 * {[3,1]}
 */
public class SimpleMinesweeper {
    private static int VISITED = -1;

    public List<List<int[]>> findBombClusters(int[][] grid) {
        List<List<int[]>> res = new ArrayList<>();
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                List<int[]> curr = new ArrayList<>();
                findBombClusters(row, col, grid, curr);
                if(!curr.isEmpty()) {
                    res.add(curr);
                }
            }
        }
        return res;
    }

    private void findBombClusters(int row, int col, int[][] grid, List<int[]> curr) {
        // TODO: move the check to a separate function
        if (row >= grid.length || row < 0
                || col >= grid[0].length || col < 0
                || grid[row][col] == 0
                || grid[row][col] == VISITED) {
            return;
        }
        int[] cell = new int[]{row, col};
        curr.add(cell);
        grid[row][col] = VISITED;

        findBombClusters(row + 1, col, grid, curr);
        findBombClusters(row - 1, col, grid, curr);
        findBombClusters(row, col + 1, grid, curr);
        findBombClusters(row, col - 1, grid, curr);
    }
}
