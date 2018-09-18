package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class SudokuSolverTest {

    @Test
    public void solveSudoku() {
        char[][] board = new char[9][9];
        board[0][0] = '5';
        board[0][1] = '3';
        board[0][2] = '.';
        board[0][3] = '.';
        board[0][4] = '7';
        board[0][5] = '.';
        board[0][6] = '.';
        board[0][7] = '.';
        board[0][8] = '.';

        board[1][0] = '6';
        board[1][1] = '.';
        board[1][2] = '.';
        board[1][3] = '1';
        board[1][4] = '1';
        board[1][5] = '1';
        board[1][6] = '1';
        board[1][7] = '1';
        board[1][8] = '1';

        board[2][0] = '1';
        board[2][1] = '1';
        board[2][2] = '1';
        board[2][3] = '1';
        board[2][4] = '1';
        board[2][5] = '1';
        board[2][6] = '1';
        board[2][7] = '1';
        board[2][8] = '1';

        board[3][0] = '1';
        board[3][1] = '1';
        board[3][2] = '1';
        board[3][3] = '1';
        board[3][4] = '1';
        board[3][5] = '1';
        board[3][6] = '1';
        board[3][7] = '1';
        board[3][8] = '1';

        board[4][0] = '1';
        board[4][1] = '1';
        board[4][2] = '1';
        board[4][3] = '1';
        board[4][4] = '1';
        board[4][5] = '1';
        board[4][6] = '1';
        board[4][7] = '1';
        board[4][8] = '1';

        board[5][0] = '1';
        board[5][1] = '1';
        board[5][2] = '1';
        board[5][3] = '1';
        board[5][4] = '1';
        board[5][5] = '1';
        board[5][6] = '1';
        board[5][7] = '1';
        board[5][8] = '1';

        board[6][0] = '1';
        board[6][1] = '1';
        board[6][2] = '1';
        board[6][3] = '1';
        board[6][4] = '1';
        board[6][5] = '1';
        board[6][6] = '1';
        board[6][7] = '1';
        board[6][8] = '1';

        board[7][0] = '1';
        board[7][1] = '1';
        board[7][2] = '1';
        board[7][3] = '1';
        board[7][4] = '1';
        board[7][5] = '1';
        board[7][6] = '1';
        board[7][7] = '1';
        board[7][8] = '1';

        board[8][0] = '1';
        board[8][1] = '1';
        board[8][2] = '1';
        board[8][3] = '1';
        board[8][4] = '1';
        board[8][5] = '1';
        board[8][6] = '1';
        board[8][7] = '1';
        board[8][8] = '1';
    }
}