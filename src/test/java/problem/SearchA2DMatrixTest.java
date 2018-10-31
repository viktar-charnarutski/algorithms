package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchA2DMatrixTest {

    @Test
    public void searchMatrix0() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        assertTrue(new SearchA2DMatrix().searchMatrix(matrix, 3));
    }

    @Test
    public void searchMatrix1() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        assertTrue(new SearchA2DMatrix().searchMatrix(matrix, 18));
    }

    @Test
    public void searchMatrix2() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        assertTrue(new SearchA2DMatrix().searchMatrix(matrix, 25));
    }

    @Test
    public void searchMatrix3() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        assertTrue(new SearchA2DMatrix().searchMatrix(matrix, 21));
    }

    @Test
    public void searchMatrix4() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        assertFalse(new SearchA2DMatrix().searchMatrix(matrix, 26));
    }

    @Test
    public void searchMatrix5() {
        int[][] matrix = {};
        assertFalse(new SearchA2DMatrix().searchMatrix(matrix, 26));
    }
}