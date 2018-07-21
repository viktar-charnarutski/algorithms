package problem;

import java.util.HashMap;

/**
 * Find the longest path in a matrix with given constraints
 * <p>
 * Given a n*n matrix where all numbers are distinct, find the maximum length path (starting from any cell)
 * such that all cells along the path are in increasing order with a difference of 1.
 * <p>
 * We can move in 4 directions from a given cell (i, j), i.e., we can move to (i+1, j) or (i, j+1) or (i-1, j)
 * or (i, j-1) with the condition that the adjacent cells have a difference of 1.
 */
public class LongestPathInMatrix {
    public int longestPathInMatrix(int[][] grid) {
        if (grid == null) return 0;
        int rowsCount = grid.length;
        int colsCount = grid[0].length;
        int maxPath = 0;
        HashMap<Cell, Integer> memo = new HashMap<>();
        for (int row = 0; row < rowsCount; row++) {
            for (int col = 0; col < colsCount; col++) {
                Cell currCell = new Cell(row, col);
                int moveLeftPath = 1 + getPathFor(new Cell(row, col - 1), currCell, grid, memo);
                int moveRightPath = 1 + getPathFor(new Cell(row, col + 1), currCell, grid, memo);
                int moveUpPath = 1 + getPathFor(new Cell(row - 1, col), currCell, grid, memo);
                int moveDownPath = 1 + getPathFor(new Cell(row + 1, col), currCell, grid, memo);
                int currPath = Math.max(Math.max(moveLeftPath, moveRightPath), Math.max(moveUpPath, moveDownPath));
                maxPath = Math.max(currPath, maxPath);
            }
        }
        return maxPath;
    }

    private int getPathFor(Cell curr, Cell prev, int[][] grid, HashMap<Cell, Integer> memo) {
        if (!isMoveValid(curr, prev, grid)) {
            return 0;
        }

        if (memo.containsKey(curr)) {
            return memo.get(curr);
        }

        int moveLeftPath = 1 + getPathFor(new Cell(curr.getRow(), curr.getColl() - 1), curr, grid, memo);
        int moveRightPath = 1 + getPathFor(new Cell(curr.getRow(), curr.getColl() + 1), curr, grid, memo);
        int moveUpPath = 1 + getPathFor(new Cell(curr.getRow() - 1, curr.getColl()), curr, grid, memo);
        int moveDownPath = 1 + getPathFor(new Cell(curr.getRow() + 1, curr.getColl()), curr, grid, memo);

        memo.put(curr, Math.max(Math.max(moveLeftPath, moveRightPath), Math.max(moveUpPath, moveDownPath)));

        return memo.get(curr);
    }

    private boolean isMoveValid(Cell curr, Cell prev, int[][] grid) {
        if (curr.equals(prev)) {
            return false;
        }
        if (curr.getRow() < 0 || curr.getRow() == grid.length) {
            return false;
        }
        if (curr.getColl() < 0 || curr.getColl() == grid[0].length) {
            return false;
        }
        return grid[curr.getRow()][curr.getColl()] - grid[prev.getRow()][prev.getColl()] == 1;
    }

    private class Cell {
        private final int row;
        private final int coll;

        Cell(int row, int coll) {
            this.row = row;
            this.coll = coll;
        }

        int getRow() {
            return row;
        }

        int getColl() {
            return coll;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Cell)) return false;

            Cell cell = (Cell) o;

            if (row != cell.row) return false;
            return coll == cell.coll;
        }

        @Override
        public int hashCode() {
            int result = row;
            result = 31 * result + coll;
            return result;
        }
    }
}
