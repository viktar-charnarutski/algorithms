package problem;

/**
 * 221. Maximal Square
 * <p>
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
 */
public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;

        int max = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == '1') {
                    max = Math.max(square(matrix, row, col), max);
                }
            }
        }

        return max;
    }

    private int square(char[][] matrix, int row, int col) {
        int startRow = row;
        int startCol = col;
        int length = 1;
        while (row < matrix.length) {
            row++;
            col++;
            if (containsZeroOrInvalid(matrix, row, col, startRow, startCol)) {
                break;
            }
            length++;
        }
        return length * length;
    }

    private boolean containsZeroOrInvalid(char[][] matrix, int row, int col, int startRow, int startCol) {
        if (row == matrix.length || col == matrix[0].length) {
            return true;
        }
        for (int i = col; i >= startCol; i--) {
            if (matrix[row][i] == '0') {
                return true;
            }
        }
        for (int i = row; i >= startRow; i--) {
            if (matrix[i][col] == '0') {
                return true;
            }
        }
        return false;
    }

}
