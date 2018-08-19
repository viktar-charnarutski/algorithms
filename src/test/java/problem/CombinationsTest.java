package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CombinationsTest {

    @Test
    public void combine() {
        int[][] expected = new int[6][2];
        expected[0][0] = 2;
        expected[0][1] = 4;
        expected[1][0] = 3;
        expected[1][1] = 4;
        expected[2][0] = 2;
        expected[2][1] = 3;
        expected[3][0] = 1;
        expected[3][1] = 2;
        expected[4][0] = 1;
        expected[4][1] = 3;
        expected[5][0] = 1;
        expected[5][1] = 4;
        assertEquals(expected, new Combinations().combine(4, 2));
    }
}