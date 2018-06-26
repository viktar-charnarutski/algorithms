package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthSmallestElementInSortedMatrixTest {

    @Test
    public void kthSmallest1() {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 5;
        matrix[0][2] = 9;
        matrix[1][0] = 10;
        matrix[1][1] = 11;
        matrix[1][2] = 13;
        matrix[2][0] = 12;
        matrix[2][1] = 13;
        matrix[2][2] = 15;
        assertEquals(13, new KthSmallestElementInSortedMatrix().kthSmallest(matrix, 8));
    }

    @Test
    public void kthSmallest2() {
        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 1;
        matrix[1][1] = 3;
        assertEquals(1, new KthSmallestElementInSortedMatrix().kthSmallest(matrix, 2));
    }
}