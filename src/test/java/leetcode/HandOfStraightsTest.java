package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HandOfStraightsTest {

    @Test
    public void isNStraightHand1() {
        assertTrue(new HandOfStraights().isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3));
    }

    @Test
    public void isNStraightHand2() {
        assertFalse(new HandOfStraights().isNStraightHand(new int[]{1, 2, 3, 4, 5}, 4));
    }

    @Test
    public void isNStraightHand3() {
        assertTrue(new HandOfStraights().isNStraightHand(new int[]{4, 2, 3, 1}, 4));
    }

    @Test
    public void isNStraightHand4() {
        assertTrue(new HandOfStraights().isNStraightHand(new int[]{4, 2, 3, 1}, 1));
    }
}