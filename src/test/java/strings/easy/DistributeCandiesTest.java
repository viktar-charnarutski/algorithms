package strings.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistributeCandiesTest {

    @Test
    public void distributeCandies() {

        DistributeCandies ins = new DistributeCandies();
        assertTrue(3 == ins.distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
        assertTrue(2 == ins.distributeCandies(new int[]{1, 1, 2, 3}));
        assertTrue(3 == ins.distributeCandies(new int[]{1, 1, 2, 3, 4, 5}));
    }
}