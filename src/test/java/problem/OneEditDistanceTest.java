package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OneEditDistanceTest {

    @Test
    public void isOneEditDistance1() {
        assertTrue(new OneEditDistance().isOneEditDistance("pale", "pal"));
    }

    @Test
    public void isOneEditDistance2() {
        assertTrue(new OneEditDistance().isOneEditDistance("pales", "pale"));
    }

    @Test
    public void isOneEditDistance3() {
        assertTrue(new OneEditDistance().isOneEditDistance("pale", "bale"));
    }

    @Test
    public void isOneEditDistance4() {
        assertFalse(new OneEditDistance().isOneEditDistance("pale", "bake"));
    }
}