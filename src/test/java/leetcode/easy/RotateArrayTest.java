package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateArrayTest {

    @Test
    public void rotate() {
        RotateArray ins = new RotateArray();
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        ins.rotate(input, 3);
        assertArrayEquals(expected, input);
    }

    @Test
    public void rotate_steps_more_than_elements() {
        RotateArray ins = new RotateArray();
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        ins.rotate(input, 8);
        assertArrayEquals(expected, input);
    }
}