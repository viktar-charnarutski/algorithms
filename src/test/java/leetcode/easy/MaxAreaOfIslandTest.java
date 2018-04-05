package leetcode.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 *
 */
public class MaxAreaOfIslandTest {

    @Test
    public void maxAreaOfIsland() {
        MaxAreaOfIsland ins = new MaxAreaOfIsland();

        int[][] input = new int[4][6];
        input[0][0] = 0;
        input[0][1] = 0;
        input[0][2] = 0;
        input[0][3] = 0;
        input[0][4] = 0;
        input[0][5] = 0;
        input[1][0] = 0;
        input[1][1] = 1;
        input[1][2] = 1;
        input[1][3] = 1;
        input[1][4] = 1;
        input[1][5] = 0;
        input[2][0] = 0;
        input[2][1] = 0;
        input[2][2] = 1;
        input[2][3] = 1;
        input[2][4] = 0;
        input[2][5] = 0;
        input[3][0] = 0;
        input[3][1] = 0;
        input[3][2] = 0;
        input[3][3] = 0;
        input[3][4] = 0;
        input[3][5] = 0;
        assertTrue(6 == ins.maxAreaOfIsland(input));
    }
}