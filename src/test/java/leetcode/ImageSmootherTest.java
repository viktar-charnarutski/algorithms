package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 */
public class ImageSmootherTest {

    private ImageSmoother ins = new ImageSmoother();

    @Test
    public void imageSmoother() {
//        int[][] input1 = new int[3][3];
//        input1[0][0] = 4;
//        input1[0][1] = 4;
//        input1[0][2] = 4;
//        input1[1][0] = 4;
//        input1[1][1] = 2;
//        input1[1][2] = 4;
//        input1[2][0] = 4;
//        input1[2][1] = 4;
//        input1[2][2] = 4;
//
//        int[][] expected1 = new int[3][3];
//        expected1[0][0] = 3;
//        expected1[0][1] = 3;
//        expected1[0][2] = 3;
//        expected1[1][0] = 3;
//        expected1[1][1] = 3;
//        expected1[1][2] = 3;
//        expected1[2][0] = 3;
//        expected1[2][1] = 3;
//        expected1[2][2] = 3;
//
//        assertArrayEquals(expected1, ins.imageSmoother(input1));
//
//        assertArrayEquals(new int[1][1], ins.imageSmoother(new int[1][1]));
//        assertArrayEquals(new int[5][5], ins.imageSmoother(new int[5][5]));
//        assertNull(ins.imageSmoother(null));


        //[[2,3,4],[5,6,7],[8,9,10],[11,12,13],[14,15,16]]
        int[][] input2 = new int[5][3];
        input2[0][0] = 2;
        input2[0][1] = 3;
        input2[0][2] = 4;
        input2[1][0] = 5;
        input2[1][1] = 6;
        input2[1][2] = 7;
        input2[2][0] = 8;
        input2[2][1] = 9;
        input2[2][2] = 10;
        input2[3][0] = 11;
        input2[3][1] = 12;
        input2[3][2] = 13;
        input2[4][0] = 14;
        input2[4][1] = 15;
        input2[4][2] = 16;

        // [[4,4,5],[5,6,6],[8,9,9],[11,12,12],[13,13,14]]
        int[][] expected2 = new int[5][3];
        expected2[0][0] = 4;
        expected2[0][1] = 4;
        expected2[0][2] = 5;
        expected2[1][0] = 5;
        expected2[1][1] = 6;
        expected2[1][2] = 6;
        expected2[2][0] = 8;
        expected2[2][1] = 9;
        expected2[2][2] = 9;
        expected2[3][0] = 11;
        expected2[3][1] = 12;
        expected2[3][2] = 12;
        expected2[4][0] = 13;
        expected2[4][1] = 13;
        expected2[4][2] = 14;

        int[][] actuals = ins.imageSmoother(input2);
        System.out.println(Arrays.deepToString(actuals));
        assertArrayEquals(expected2, actuals);
    }
}