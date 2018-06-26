package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IncreasingTripletSubsequenceTest {

    @Test
    public void increasingTriplet1() {
        assertTrue(new IncreasingTripletSubsequence().increasingTriplet(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void increasingTriplet2() {
        assertFalse(new IncreasingTripletSubsequence().increasingTriplet(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    public void increasingTriplet3() {
        assertTrue(new IncreasingTripletSubsequence().increasingTriplet(new int[]{12, 10, 13, 4, 15}));
    }
}