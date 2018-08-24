package problem;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateSquareImageTest {

    @Test
    public void rotateSquareImageCW() {
        int[][] input = new int[3][3];
        input[0][0] = 1;
        input[0][1] = 2;
        input[0][2] = 3;
        input[1][0] = 4;
        input[1][1] = 5;
        input[1][2] = 6;
        input[2][0] = 7;
        input[2][1] = 8;
        input[2][2] = 9;
        int[][] expected = new int[3][3];
        expected[0][0] = 7;
        expected[0][1] = 4;
        expected[0][2] = 1;
        expected[1][0] = 8;
        expected[1][1] = 5;
        expected[1][2] = 2;
        expected[2][0] = 9;
        expected[2][1] = 6;
        expected[2][2] = 3;
        RotateSquareImage.rotateSquareImageCW(input);
        assertArrayEquals(expected, input);
    }
}