package problem;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

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
}