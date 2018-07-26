package problem;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class FlippingAnImageTest {

    @Test
    public void flipAndInvertImage1() {
        int[][] input = new int[3][3];
        input[0][0] = 1;
        input[0][1] = 1;
        input[0][2] = 0;
        input[1][0] = 1;
        input[1][1] = 0;
        input[1][2] = 1;
        input[2][0] = 0;
        input[2][1] = 0;
        input[2][2] = 0;

        int[][] expected = new int[3][3];
        expected[0][0] = 1;
        expected[0][1] = 0;
        expected[0][2] = 0;
        expected[1][0] = 0;
        expected[1][1] = 1;
        expected[1][2] = 0;
        expected[2][0] = 1;
        expected[2][1] = 1;
        expected[2][2] = 1;

        assertTrue(Arrays.deepEquals(expected, new FlippingAnImage().flipAndInvertImage(input)));
    }
    @Test
    public void flipAndInvertImage2() {
        int[][] input = new int[4][4];
        input[0][0] = 1;
        input[0][1] = 1;
        input[0][2] = 0;
        input[0][3] = 0;
        input[1][0] = 1;
        input[1][1] = 0;
        input[1][2] = 0;
        input[1][3] = 1;
        input[2][0] = 0;
        input[2][1] = 1;
        input[2][2] = 1;
        input[2][3] = 1;
        input[3][0] = 1;
        input[3][1] = 0;
        input[3][2] = 1;
        input[3][3] = 0;

        int[][] expected = new int[4][4];
        expected[0][0] = 1;
        expected[0][1] = 1;
        expected[0][2] = 0;
        expected[0][3] = 0;
        expected[1][0] = 0;
        expected[1][1] = 1;
        expected[1][2] = 1;
        expected[1][3] = 0;
        expected[2][0] = 0;
        expected[2][1] = 0;
        expected[2][2] = 0;
        expected[2][3] = 1;
        expected[3][0] = 1;
        expected[3][1] = 0;
        expected[3][2] = 1;
        expected[3][3] = 0;

        assertTrue(Arrays.deepEquals(expected, new FlippingAnImage().flipAndInvertImage(input)));
    }
}