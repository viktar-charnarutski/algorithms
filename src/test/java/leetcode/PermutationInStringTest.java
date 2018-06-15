package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PermutationInStringTest {

    @Test
    public void checkInclusion1() {
        assertTrue(new PermutationInString().checkInclusion("ab", "eidbaooo"));
    }

    @Test
    public void checkInclusion2() {
        assertFalse(new PermutationInString().checkInclusion("ab", "eidboaoo"));
    }

    @Test
    public void checkInclusion3() {
        assertTrue(new PermutationInString().checkInclusion("", "eidboaoo"));
    }

    @Test
    public void checkInclusion4() {
        assertFalse(new PermutationInString().checkInclusion("ab", ""));
    }

    @Test
    public void checkInclusion5() {
        assertTrue(new PermutationInString().checkInclusion("adc", "dcda"));
    }
}