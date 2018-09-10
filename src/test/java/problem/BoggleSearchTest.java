package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BoggleSearchTest {

    @Test
    public void boggleSearch1() {
        char[][] board = new char[5][5];
        board[0][0] = 'a';
        board[0][1] = 'h';
        board[0][2] = 'e';
        board[0][3] = 'a';
        board[0][4] = 'a';
        board[1][0] = 'a';
        board[1][1] = 'a';
        board[1][2] = 'l';
        board[1][3] = 'a';
        board[1][4] = 'a';
        board[2][0] = 'a';
        board[2][1] = 'o';
        board[2][2] = 'l';
        board[2][3] = 'a';
        board[2][4] = 'a';
        board[3][0] = 'a';
        board[3][1] = 'a';
        board[3][2] = 'a';
        board[3][3] = 'a';
        board[3][4] = 'a';
        board[4][0] = 'a';
        board[4][1] = 'a';
        board[4][2] = 'a';
        board[4][3] = 'a';
        board[4][4] = 'a';
        assertTrue(BoggleSearch.boggleSearch(board, "hello"));
    }

    @Test
    public void boggleSearch2() {
        char[][] board = new char[5][5];
        board[0][0] = 'a';
        board[0][1] = 'h';
        board[0][2] = 'e';
        board[0][3] = 'a';
        board[0][4] = 'a';
        board[1][0] = 'a';
        board[1][1] = 'a';
        board[1][2] = 'l';
        board[1][3] = 'a';
        board[1][4] = 'a';
        board[2][0] = 'a';
        board[2][1] = 'o';
        board[2][2] = 'l';
        board[2][3] = 'a';
        board[2][4] = 'a';
        board[3][0] = 'a';
        board[3][1] = 'a';
        board[3][2] = 'a';
        board[3][3] = 'a';
        board[3][4] = 'a';
        board[4][0] = 'a';
        board[4][1] = 'a';
        board[4][2] = 'a';
        board[4][3] = 'a';
        board[4][4] = 'a';
        assertFalse(BoggleSearch.boggleSearch(board, "helo"));
    }

    @Test
    public void boggleSearch3() {
        char[][] board = new char[5][5];
        board[0][0] = 'a';
        board[0][1] = 'h';
        board[0][2] = 'e';
        board[0][3] = 'l';
        board[0][4] = 'l';
        board[1][0] = 'a';
        board[1][1] = 'a';
        board[1][2] = 'l';
        board[1][3] = 'a';
        board[1][4] = 'a';
        board[2][0] = 'a';
        board[2][1] = 'a';
        board[2][2] = 'l';
        board[2][3] = 'o';
        board[2][4] = 'a';
        board[3][0] = 'a';
        board[3][1] = 'a';
        board[3][2] = 'a';
        board[3][3] = 'a';
        board[3][4] = 'a';
        board[4][0] = 'a';
        board[4][1] = 'a';
        board[4][2] = 'a';
        board[4][3] = 'a';
        board[4][4] = 'a';
        assertTrue(BoggleSearch.boggleSearch(board, "helo"));
    }
}