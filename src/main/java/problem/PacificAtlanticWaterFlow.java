package problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 417. Pacific Atlantic Water Flow
 * <p>
 * Given an m x n matrix of non-negative integers representing the height of each unit cell in a continent,
 * the "Pacific ocean" touches the left and top edges of the matrix and the "Atlantic ocean" touches the right and
 * bottom edges.
 * <p>
 * Water can only flow in four directions (up, down, left, or right) from a cell to another one with height equal or
 * lower.
 * <p>
 * Find the list of grid coordinates where water can flow to both the Pacific and Atlantic ocean.
 */
public class PacificAtlanticWaterFlow {
    public List<int[]> pacificAtlantic(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return Collections.emptyList();
        List<int[]> res = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (couldFlow(row, col, matrix)) {
                    res.add(new int[]{row, col});
                }
            }
        }
        return res;
    }

    private boolean couldFlow(int row, int col, int[][] matrix) {
        return couldFlowToPacific(row, col, matrix, Integer.MAX_VALUE, new Boolean[matrix.length][matrix[0].length])
                && couldFlowToAtlantic(row, col, matrix, Integer.MAX_VALUE, new Boolean[matrix.length][matrix[0].length]);
    }

    private boolean couldFlowToPacific(int row, int col, int[][] matrix, int flowingFromValue, Boolean[][] memo) {
        if (isCoordinatesNotValid(row, col, matrix)
                || matrix[row][col] > flowingFromValue) return false;

        if (memo[row][col] != null) return memo[row][col];

        if (row == 0 || col == 0) return true;
        return memo[row][col] = couldFlowToPacific(row + 1, col, matrix, matrix[row][col], memo)
                || couldFlowToPacific(row, col + 1, matrix, matrix[row][col], memo)
                || couldFlowToPacific(row - 1, col, matrix, matrix[row][col], memo)
                || couldFlowToPacific(row, col - 1, matrix, matrix[row][col], memo);
    }

    private boolean couldFlowToAtlantic(int row, int col, int[][] matrix, int flowingFromValue, Boolean[][] memo) {
        if (isCoordinatesNotValid(row, col, matrix)
                || matrix[row][col] > flowingFromValue) return false;

        if (memo[row][col] != null) return memo[row][col];

        if (row == matrix.length - 1 || col == matrix[0].length - 1) return true;
        return memo[row][col] = couldFlowToAtlantic(row + 1, col, matrix, matrix[row][col], memo)
                || couldFlowToAtlantic(row, col + 1, matrix, matrix[row][col], memo)
                || couldFlowToAtlantic(row - 1, col, matrix, matrix[row][col], memo)
                || couldFlowToAtlantic(row, col - 1, matrix, matrix[row][col], memo);
    }

    private boolean isCoordinatesNotValid(int row, int col, int[][] matrix) {
        return row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length;
    }
}
