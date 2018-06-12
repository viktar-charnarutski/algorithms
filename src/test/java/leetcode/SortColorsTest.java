package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortColorsTest {

    @Test
    public void sortColors1() {
        int[] arr = {2, 0, 2, 1, 1, 0};
        new SortColors().sortColors(arr);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, arr);
    }

    @Test
    public void sortColors2() {
        int[] arr = {2, 0, 1};
        new SortColors().sortColors(arr);
        assertArrayEquals(new int[]{0, 1, 2}, arr);
    }

    @Test
    public void sortColors3() {
        int[] arr = {2, 2};
        new SortColors().sortColors(arr);
        assertArrayEquals(new int[]{2, 2}, arr);
    }
}