package problem;

/**
 * Rotate a Square Image Clockwise
 * <p>
 * You are given a square 2D image matrix where each integer represents a pixel. Write a method rotateSquareImageCW
 * to rotate the image clockwise - in-place.
 */
public class RotateSquareImage {
    public static void rotateSquareImageCW(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        transpose(matrix);
        flipVertical(matrix);
    }

    private static void transpose(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = row + 1; col < matrix[0].length; col++) {
                int tmp = matrix[col][row];
                matrix[col][row] = matrix[row][col];
                matrix[row][col] = tmp;
            }
        }
    }

    private static void flipVertical(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col = 0; col < row.length / 2; col++) {
                int tmp = row[col];
                row[col] = row[row.length - 1 - col];
                row[row.length - 1 - col] = tmp;
            }
        }
    }
}
