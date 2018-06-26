package problem;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 */
public class FloodFillTest {
    FloodFill ins = new FloodFill();

    @Test
    public void floodFill() {
        int[][] input = new int[3][3];
        input[0][0] = 1;
        input[0][1] = 1;
        input[0][2] = 1;
        input[1][0] = 1;
        input[1][1] = 1;
        input[1][2] = 0;
        input[2][0] = 1;
        input[2][1] = 0;
        input[2][2] = 1;
        int[][] output = new int[3][3];
        output[0][0] = 2;
        output[0][1] = 2;
        output[0][2] = 2;
        output[1][0] = 2;
        output[1][1] = 2;
        output[1][2] = 0;
        output[2][0] = 2;
        output[2][1] = 0;
        output[2][2] = 1;
        assertArrayEquals(output, ins.floodFill(input, 1, 1, 2));

        int[][] input1 = new int[1][1];
        input1[0][0] = 1;
        int[][] expected1 = new int[1][1];
        expected1[0][0] = 2;
        assertArrayEquals(expected1, ins.floodFill(input1, 0, 0, 2));

        int[][] input2 = new int[2][3];
        input2[0][0] = 0;
        input2[0][1] = 0;
        input2[0][2] = 0;
        input2[1][0] = 0;
        input2[1][1] = 1;
        input2[1][2] = 1;
        int[][] expected2 = new int[2][3];
        expected2[0][0] = 0;
        expected2[0][1] = 0;
        expected2[0][2] = 0;
        expected2[1][0] = 0;
        expected2[1][1] = 1;
        expected2[1][2] = 1;
        assertArrayEquals(expected2, ins.floodFill(input2, 1, 1, 1));
    }
}