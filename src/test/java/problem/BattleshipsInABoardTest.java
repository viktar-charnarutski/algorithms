package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BattleshipsInABoardTest {

    @Test
    public void countBattleships() {
        char[][] board = new char[4][4];
        board[0][0] = 'X';
        board[0][1] = '.';
        board[0][2] = '.';
        board[0][3] = 'X';
        board[1][0] = '.';
        board[1][1] = '.';
        board[1][2] = '.';
        board[1][3] = 'X';
        board[2][0] = '.';
        board[2][1] = '.';
        board[2][2] = '.';
        board[2][3] = 'X';
        board[3][0] = '.';
        board[3][1] = '.';
        board[3][2] = '.';
        board[3][3] = 'X';

        BattleshipsInABoard ins = new BattleshipsInABoard();
        assertEquals(2, ins.countBattleships(board));
    }

    @Test
    public void countBattleships_one_row() {
        char[][] board = new char[1][3];
        board[0][0] = 'X';
        board[0][1] = '.';
        board[0][2] = 'X';

        BattleshipsInABoard ins = new BattleshipsInABoard();
        assertEquals(2, ins.countBattleships(board));
    }

    @Test
    public void countBattleships_one_row_one_ship() {
        char[][] board = new char[1][3];
        board[0][0] = 'X';
        board[0][1] = 'X';
        board[0][2] = 'X';

        BattleshipsInABoard ins = new BattleshipsInABoard();
        assertEquals(1, ins.countBattleships(board));
    }
}