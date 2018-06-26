package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KDiffPairsInArrayTest {

    @Test
    public void findPairs1() {
        assertEquals(2, new KDiffPairsInArray().findPairs(new int[]{3, 1, 4, 1, 5}, 2));
    }

    @Test
    public void findPairs2() {
        assertEquals(4, new KDiffPairsInArray().findPairs(new int[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    public void findPairs3() {
        assertEquals(1, new KDiffPairsInArray().findPairs(new int[]{1, 3, 1, 5, 4}, 0));
    }

    @Test
    public void findPairs4() {
        assertEquals(0, new KDiffPairsInArray().findPairs(new int[]{1, 3, 1, 5, 4}, -1));
    }

    @Test
    public void findPairs5() {
        assertEquals(1, new KDiffPairsInArray().findPairs(new int[]{1, 1, 1, 1, 1}, 0));
    }
}