package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 */
public class ReshapeTheMatrixTest {

    @Test
    public void matrixReshape() {
        ReshapeTheMatrix ins = new ReshapeTheMatrix();

        int[][] input = new int[2][2];
        input[0][0] = 1;
        input[0][1] = 2;
        input[1][0] = 3;
        input[1][1] = 4;

        int[][] expected = new int[1][4];
        expected[0][0] = 1;
        expected[0][1] = 2;
        expected[0][2] = 3;
        expected[0][3] = 4;

        assertArrayEquals(expected, ins.matrixReshape(input, 1, 4));
    }
}