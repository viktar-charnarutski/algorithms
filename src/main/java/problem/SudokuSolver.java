package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * 37. Sudoku Solver
 * <p>
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * <p>
 * A sudoku solution must satisfy all of the following rules:
 * <p>
 * Each of the digits 1-9 must occur exactly once in each row.
 * Each of the digits 1-9 must occur exactly once in each column.
 * Each of the the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
 * Empty cells are indicated by the character '.'.
 */
public class SudokuSolver {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length < 9 || board[0].length < 9) {
            throw new IllegalArgumentException();
        }
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == '.') {
                    List<Integer> variants = variants(row, col, board);
                    if (variants.isEmpty()) {
                        return false;
                    }
                    for (int var : variants) {
                        board[row][col] = (char) var;
                        if (solve(board)) {
                            return true;
                        }
                        board[row][col] = '.';
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private List<Integer> variants(int row, int col, char[][] board) {
        List<Integer> variants = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            if (isValid((char) i, row, col, board)) {
                variants.add(i);
            }
        }
        return variants;
    }

    private boolean isValid(char num, int row, int col, char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
            if (board[row][i] == num) {
                return false;
            }
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == num) {
                return false;
            }
        }
        return true;
    }
}
