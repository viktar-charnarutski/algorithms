package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 */
public class IntersectionOfTwoArraysTest {

    @Test
    public void intersection() {

        IntersectionOfTwoArrays ins = new IntersectionOfTwoArrays();
        int[] input1 = new int[]{1, 2, 2, 3, 4, 5, 6, 7, 8, 7, 7, 9};
        int[] input2 = new int[]{2, 2, 5};
        int[] expected = new int[]{2, 5};

        assertArrayEquals(expected, ins.intersection(input1, input2));
    }
}