package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SplitArrayWithSameAverageTest {

    @Test
    public void splitArraySameAverage1() {
        assertTrue(new SplitArrayWithSameAverage().splitArraySameAverage(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }

    @Test
    public void splitArraySameAverage2() {
        assertFalse(new SplitArrayWithSameAverage().splitArraySameAverage(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }
}