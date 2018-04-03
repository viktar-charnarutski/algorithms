package strings.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ToeplitzMatrixTest {

    @Test
    public void isToeplitzMatrix() {
        ToeplitzMatrix ins = new ToeplitzMatrix();

        int[][] input1 = new int[4][4];
        input1[0][0] = 1;
        input1[0][1] = 2;
        input1[0][2] = 3;
        input1[0][3] = 4;
        input1[1][0] = 5;
        input1[1][1] = 1;
        input1[1][2] = 2;
        input1[1][3] = 3;
        input1[2][0] = 9;
        input1[2][1] = 5;
        input1[2][2] = 1;
        input1[2][3] = 2;

        assertTrue(ins.isToeplitzMatrix(input1));
    }
}