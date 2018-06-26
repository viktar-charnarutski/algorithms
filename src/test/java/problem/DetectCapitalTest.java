package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 */
public class DetectCapitalTest {

    @Test
    public void detectCapitalUseAllCap() {
        assertTrue(new DetectCapital().detectCapitalUse("USA"));
    }
    @Test
    public void detectCapitalUseFirstCap() {
        assertTrue(new DetectCapital().detectCapitalUse("Google"));
    }
    @Test
    public void detectCapitalUseNoneCap() {
        assertTrue(new DetectCapital().detectCapitalUse("leetcode"));
    }

    @Test
    public void detectCapitalUseWrongCap() {
        assertFalse(new DetectCapital().detectCapitalUse("FlaG"));
        assertFalse(new DetectCapital().detectCapitalUse("flaG"));
        assertFalse(new DetectCapital().detectCapitalUse("FLAg"));
    }
}