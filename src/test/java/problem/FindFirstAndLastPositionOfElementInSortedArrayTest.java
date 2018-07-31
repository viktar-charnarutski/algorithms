package problem;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    public void searchRange1() {
        assertArrayEquals(new int[]{3, 4},
                new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }

    @Test
    public void searchRange2() {
        assertArrayEquals(new int[]{-1, -1},
                new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));
    }

    @Test
    public void searchRange3() {
        assertArrayEquals(new int[]{5, 5},
                new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 10));
    }

    @Test
    public void searchRange4() {
        assertArrayEquals(new int[]{-1, -1},
                new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{0}, 5));
    }

    @Test
    public void searchRange5() {
        assertArrayEquals(new int[]{0, 0},
                new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{5}, 5));
    }

    @Test
    public void searchRange_find() {
        assertEquals(2,
                new FindFirstAndLastPositionOfElementInSortedArray().findIndex(new int[]{5, 7, 7, 8, 8, 10}, 7));
    }
}