package problem;

import java.util.HashSet;
import java.util.Set;

/**
 * Robot in a Grid
 * <p>
 * Imagine a robot sitting on the upper left corner of grid with r rows and c columns.
 * <p>
 * The robot can only move in two directions, right and down, but certain cells are "off limits" such that
 * the robot cannot step on them.
 * <p>
 * Design an algorithm to find a path for the robot from the top left to the bottom right.
 */
public class RobotInGrid {
    public boolean hasPath(int[][] grid) {
        Set<Cell> blockedCells = new HashSet<>();
        return check(grid, 0, 1, blockedCells) || check(grid, 1, 0, blockedCells);
    }

    private boolean check(int[][] grid, int row, int col, Set<Cell> blockedCells) {
        Cell cell = new Cell(row, col);
        if (blockedCells.contains(cell) || col == grid[0].length || row == grid.length || grid[row][col] == 1) {
            blockedCells.add(cell);
            return false;
        }
        if (col == grid[0].length - 1 && row == grid.length - 1 && grid[row][col] == 0) {
            return true;
        }
        return check(grid, row + 1, col, blockedCells) || check(grid, row, col + 1, blockedCells);
    }

    private class Cell {
        private final int rowNum;
        private final int colNum;

        Cell(int rowNum, int colNum) {
            this.rowNum = rowNum;
            this.colNum = colNum;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Cell)) return false;

            Cell cell = (Cell) o;

            if (rowNum != cell.rowNum) return false;
            return colNum == cell.colNum;
        }

        @Override
        public int hashCode() {
            int result = rowNum;
            result = 31 * result + colNum;
            return result;
        }
    }
}
