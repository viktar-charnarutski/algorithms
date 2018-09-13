package problem;

/**
 * 79. Word Search
 * <p>
 * Given a 2D board and a word, find if the word exists in the grid.
 * <p>
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally
 * or vertically neighboring. The same letter cell may not be used more than once.
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if (board.length == 0) {
            return false;
        }
        if (word.length() == 0) {
            return true;
        }
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (exist(board, word, row, col, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean exist(char[][] board, String word, int row, int col, int i) {
        if (i == word.length()) {
            return true;
        }
        if (row >= board.length || row < 0
                || col >= board[0].length || col < 0
                || board[row][col] == '*'
                || board[row][col] != word.charAt(i)) {
            return false;
        }

        board[row][col] = '*';
        boolean res = exist(board, word, row + 1, col, i + 1)
                || exist(board, word, row - 1, col, i + 1)
                || exist(board, word, row, col + 1, i + 1)
                || exist(board, word, row, col - 1, i + 1);
        board[row][col] = word.charAt(i);
        return res;
    }
}
