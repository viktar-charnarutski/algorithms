package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ZeroMatrixTest {

    @Test
    public void zeroMatrix() {
        int[][] m = new int[5][5];
        m[0][0] = 1;
        m[0][1] = 1;
        m[0][2] = 1;
        m[0][3] = 1;
        m[0][4] = 1;
        m[1][0] = 1;
        m[1][1] = 1;
        m[1][2] = 1;
        m[1][3] = 1;
        m[1][4] = 1;
        m[2][0] = 1;
        m[2][1] = 1;
        m[2][2] = 1;
        m[2][3] = 1;
        m[2][4] = 1;
        m[3][0] = 1;
        m[3][1] = 1;
        m[3][2] = 1;
        m[3][3] = 1;
        m[3][4] = 1;
        m[4][0] = 1;
        m[4][1] = 1;
        m[4][2] = 1;
        m[4][3] = 0;
        m[4][4] = 1;

        int[][] n = new int[5][5];
        n[0][0] = 1;
        n[0][1] = 1;
        n[0][2] = 1;
        n[0][3] = 0;
        n[0][4] = 1;
        n[1][0] = 1;
        n[1][1] = 1;
        n[1][2] = 1;
        n[1][3] = 0;
        n[1][4] = 1;
        n[2][0] = 1;
        n[2][1] = 1;
        n[2][2] = 1;
        n[2][3] = 0;
        n[2][4] = 1;
        n[3][0] = 1;
        n[3][1] = 1;
        n[3][2] = 1;
        n[3][3] = 0;
        n[3][4] = 1;
        n[4][0] = 0;
        n[4][1] = 0;
        n[4][2] = 0;
        n[4][3] = 0;
        n[4][4] = 0;
        new ZeroMatrix().zeroMatrix(m);
        assertArrayEquals(n, m);
    }
}