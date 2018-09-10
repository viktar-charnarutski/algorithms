package problem;

/**
 * Boggle Search
 * <p>
 * You're given a 2D Boggle Board which contains an m x n matrix of chars - char[][] board, and a String - word.
 * Write a method - boggleSearch that searches the Boggle Board for the presence of the input word. Words on the board
 * can be constructed with sequentially adjacent letters, where adjacent letters are horizontal or vertical neighbors
 * (not diagonal). Also, each letter on the Boggle Board must be used only once.
 */
public class BoggleSearch {
    public static boolean boggleSearch(char[][] board, String word){
        if (board == null || board.length == 0) {
            return false;
        }
        if (word == null || word.length() == 0) {
            return false;
        }
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (boggleSearch(row, col, 0, board, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean boggleSearch(int r, int c, int i, char[][] board, String word){
        if (i == word.length()) {
            return true;
        }
        if (r >= board.length || r < 0 || c >= board[0].length || c < 0
                || board[r][c] == '*' || board[r][c] != word.charAt(i)) {
            return false;
        }
        board[r][c] = '*';

        boolean res = boggleSearch(r - 1, c, i + 1, board, word)
                || boggleSearch(r + 1, c, i + 1, board, word)
                || boggleSearch(r, c - 1, i + 1, board, word)
                || boggleSearch(r, c + 1, i + 1, board, word);

        board[r][c] = word.charAt(i);

        return res;
    }
}
