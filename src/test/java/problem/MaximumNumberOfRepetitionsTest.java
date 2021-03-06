package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumNumberOfRepetitionsTest {

    @Test
    public void getMaxRepetition1() {
        assertEquals(4, MaximumNumberOfRepetitions.getMaxRepetition(new int[]{3, 1, 2, 2, 3, 4, 4, 4}));
    }

    @Test
    public void getMaxRepetition2() {
        assertEquals(6, MaximumNumberOfRepetitions.getMaxRepetition(new int[]{3, 6, 1, 2, 5, 7, 4, 6, 2, 6}));
    }

    @Test
    public void getMaxRepetition3() {
        assertEquals(3, MaximumNumberOfRepetitions.getMaxRepetition(new int[]{0, 1, 2, 2, 3, 3, 3, 4}));
    }

    @Test
    public void getMaxRepetition4() {
        assertEquals(1, MaximumNumberOfRepetitions.getMaxRepetition(new int[]{1, 1}));
    }

    @Test
    public void getMaxRepetition5() {
        assertEquals(0, MaximumNumberOfRepetitions.getMaxRepetition(new int[]{0}));
    }

    @Test
    public void getMaxRepetition6() {
        assertEquals(-1, MaximumNumberOfRepetitions.getMaxRepetition(new int[]{}));
    }

    @Test
    public void getMaxRepetition7() {
        assertEquals(-1, MaximumNumberOfRepetitions.getMaxRepetition(null));
    }
}