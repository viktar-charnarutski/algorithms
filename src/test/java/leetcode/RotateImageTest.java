package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateImageTest {

    @Test
    public void rotate() {
        int[][] m = new int[3][3];
        m[0][0] = 1;
        m[0][1] = 2;
        m[0][2] = 3;
        m[1][0] = 4;
        m[1][1] = 5;
        m[1][2] = 6;
        m[2][0] = 7;
        m[2][1] = 8;
        m[2][2] = 9;

        int[][] r = new int[3][3];
        r[0][0] = 7;
        r[0][1] = 4;
        r[0][2] = 1;
        r[1][0] = 8;
        r[1][1] = 5;
        r[1][2] = 2;
        r[2][0] = 9;
        r[2][1] = 6;
        r[2][2] = 3;

        new RotateImage().rotate(m);
        assertArrayEquals(r, m);
    }
}