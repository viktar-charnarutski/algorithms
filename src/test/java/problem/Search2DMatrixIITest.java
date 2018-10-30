package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class Search2DMatrixIITest {

    @Test
    public void searchMatrix() {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        assertTrue(new Search2DMatrixII().searchMatrix(matrix, 5));
    }
}