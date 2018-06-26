package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxIncreaseToKeepCitySkylineTest {

    @Test
    public void maxIncreaseKeepingSkyline() {
        MaxIncreaseToKeepCitySkyline ins = new MaxIncreaseToKeepCitySkyline();
        int[][] city = new int[4][4];
        city[0][0] = 3;
        city[0][1] = 0;
        city[0][2] = 8;
        city[0][3] = 4;

        city[1][0] = 2;
        city[1][1] = 4;
        city[1][2] = 5;
        city[1][3] = 7;

        city[2][0] = 9;
        city[2][1] = 2;
        city[2][2] = 6;
        city[2][3] = 3;

        city[3][0] = 0;
        city[3][1] = 3;
        city[3][2] = 1;
        city[3][3] = 0;

        assertEquals(35, ins.maxIncreaseKeepingSkyline(city));
    }
}