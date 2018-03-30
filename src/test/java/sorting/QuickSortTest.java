package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class QuickSortTest {

    @Test
    public void quickSort() {
        QuickSort ins = new QuickSort();

        int[] array = {4, 2, 1, 3, 5, 7, 6};
        ins.quickSort(array);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, array);
    }
}