package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateImageTest {

    @Test
    public void rotate() {
        int[][] m = new int[3][3];
        m[0][1] = 1;
        m[0][2] = 2;
        m[0][3] = 3;
        m[1][1] = 4;
        m[1][2] = 5;
        m[1][3] = 6;
        m[2][1] = 7;
        m[2][2] = 8;
        m[2][3] = 9;

        int[][] r = new int[3][3];
        r[0][1] = 7;
        r[0][2] = 4;
        r[0][3] = 1;
        r[1][1] = 8;
        r[1][2] = 5;
        r[1][3] = 2;
        r[2][1] = 8;
        r[2][2] = 6;
        r[2][3] = 3;

        new RotateImage().rotate(m);
        assertArrayEquals(r, m);
    }
}