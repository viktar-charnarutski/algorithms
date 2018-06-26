package problem;

/**
 * 419. Battleships in a Board
 * <p>
 * Given an 2D board, count how many battleships are in it. The battleships are represented with 'X's,
 * empty slots are represented with '.'s. You may assume the following rules:
 * <p>
 * You receive a valid board, made of only battleships or empty slots.
 * Battleships can only be placed horizontally or vertically. In other words, they can only be made of
 * the shape 1xN (1 row, N columns) or Nx1 (N rows, 1 column), where N can be of any size.
 * <p>
 * At least one horizontal or vertical cell separates between two battleships - there are no adjacent battleships.
 */
public class BattleshipsInABoard {
    public int countBattleships(char[][] board) {
        int count = 0;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == '.') continue;
                if (row - 1 >= 0 && board[row - 1][col] == 'X') continue;
                if (col - 1 >= 0 && board[row][col - 1] == 'X') continue;
                count++;
            }
        }
        return count;
    }
}
