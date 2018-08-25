package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SpiralMatrixTest {

    @Test
    public void spiralOrder1() {
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

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(6);
        expected.add(9);
        expected.add(8);
        expected.add(7);
        expected.add(4);
        expected.add(5);

        assertEquals(expected, new SpiralMatrix().spiralOrder(input));
    }

    @Test
    public void spiralOrder2() {
        int[][] input = new int[3][4];
        input[0][0] = 1;
        input[0][1] = 2;
        input[0][2] = 3;
        input[0][3] = 4;
        input[1][0] = 5;
        input[1][1] = 6;
        input[1][2] = 7;
        input[1][3] = 8;
        input[2][0] = 9;
        input[2][1] = 10;
        input[2][2] = 11;
        input[2][3] = 12;

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(8);
        expected.add(12);
        expected.add(11);
        expected.add(10);
        expected.add(9);
        expected.add(5);
        expected.add(6);
        expected.add(7);

        assertEquals(expected, new SpiralMatrix().spiralOrder(input));
    }
}