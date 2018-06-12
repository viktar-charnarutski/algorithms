package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortColorsTest {

    @Test
    public void sortColors() {
        int[] arr = {2, 0, 2, 1, 1, 0};
        new SortColors().sortColors(arr);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, arr);
    }
}