package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. Spiral Matrix
 * <p>
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder1(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0)
            return res;
        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) res.add(matrix[r1][c]);
            for (int r = r1 + 1; r <= r2; r++) res.add(matrix[r][c2]);
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) res.add(matrix[r2][c]);
                for (int r = r2; r > r1; r--) res.add(matrix[r][c1]);
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return res;
    }

    public List<Integer> spiralOrder(int[][] inputMatrix) {
        int rows = inputMatrix.length;
        int cols = inputMatrix[0].length;

        List<Integer> res = new ArrayList<>();

        Integer left = 0, right = cols - 1;
        Integer top = 0, bottom = rows - 1;

        while (left <= right && top <= bottom) {
            // go from left to right
            for (int i = left; i <= right; i++) {
                res.add(inputMatrix[top][i]);
            }
            top++;
            // go from top to bottom
            for (int i = top; i <= bottom; i++) {
                res.add(inputMatrix[i][right]);
            }
            right--;
            // go from right to left
            for (int i = right; i >= left; i--) {
                res.add(inputMatrix[bottom][i]);
            }
            bottom--;
            // go from bottom to top
            for (int i = bottom; i >= top; i--) {
                res.add(inputMatrix[i][left]);
            }
            left++;
        }

        return res;
    }
}
