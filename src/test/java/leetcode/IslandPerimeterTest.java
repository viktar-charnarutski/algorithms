package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 *
 */
public class IslandPerimeterTest {

    @Test
    public void islandPerimeter() {
        IslandPerimeter ins = new IslandPerimeter();

        int[][] input1 = new int[4][4];
        input1[0][0] = 0;
        input1[0][1] = 1;
        input1[0][2] = 0;
        input1[0][3] = 0;
        input1[1][0] = 1;
        input1[1][1] = 1;
        input1[1][2] = 1;
        input1[1][3] = 0;
        input1[2][0] = 0;
        input1[2][1] = 1;
        input1[2][2] = 0;
        input1[2][3] = 0;
        input1[3][0] = 1;
        input1[3][1] = 1;
        input1[3][2] = 0;
        input1[3][3] = 0;

        assertTrue(16 == ins.islandPerimeter(input1));


        int[][] input2 = new int[1][1];
        input2[0][0] = 1;
        assertTrue(4 == ins.islandPerimeter(input2));

        int[][] input3 = new int[2][1];
        input3[0][0] = 1;
        input3[1][0] = 0;
        assertTrue(4 == ins.islandPerimeter(input3));

        int[][] input4 = new int[1][2];
        input4[0][0] = 1;
        input4[0][1] = 0;
        assertTrue(4 == ins.islandPerimeter(input4));
    }
}