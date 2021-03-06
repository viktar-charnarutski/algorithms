package problem;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DistributeCandiesTest {

    @Test
    public void distributeCandies() {

        DistributeCandies ins = new DistributeCandies();
        assertTrue(3 == ins.distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
        assertTrue(2 == ins.distributeCandies(new int[]{1, 1, 2, 3}));
        assertTrue(3 == ins.distributeCandies(new int[]{1, 1, 2, 3, 4, 5}));
        assertTrue(2 == ins.distributeCandies(new int[]{100000, 0, 100000, 0, 100000, 0, 100000, 0, 100000, 0, 100000, 0}));
    }
}