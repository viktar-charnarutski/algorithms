package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class PancakeSortTest {

    @Test
    public void pancakeSort1() {
        int[] input = new int[]{6, 0, 2, 1, 4, 3, 5};
        int[] expected = new int[]{0, 1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, new PancakeSort().pancakeSort(input));
    }

    @Test
    public void pancakeSort2() {
        int[] input = new int[]{0, 1, 2, 3, 4, 5, 6};
        int[] expected = new int[]{0, 1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, new PancakeSort().pancakeSort(input));
    }

    @Test
    public void pancakeSort3() {
        int[] input = new int[]{6, 5, 4, 3, 2, 1, 0};
        int[] expected = new int[]{0, 1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, new PancakeSort().pancakeSort(input));
    }

    @Test
    public void pancakeSort4() {
        int[] input = new int[]{0};
        int[] expected = new int[]{0};
        assertArrayEquals(expected, new PancakeSort().pancakeSort(input));
    }

    @Test
    public void pancakeSort5() {
        int[] input = new int[]{1, 0};
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, new PancakeSort().pancakeSort(input));
    }
}