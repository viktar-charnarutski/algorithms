package problem;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

    @Test
    public void sort1() {
        int[] input = new int[]{4,12,4,78,7,-1};
        int[] expected = new int[]{-1, 4, 4, 7, 12, 78};
        new SelectionSort().sort(input);
        assertArrayEquals(expected, input);
    }
}