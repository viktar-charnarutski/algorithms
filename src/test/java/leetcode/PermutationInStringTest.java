package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PermutationInStringTest {

    @Test
    public void checkInclusion1() {
        assertTrue(new PermutationInString().checkInclusion("eidbaooo", "ab"));
    }

    @Test
    public void checkInclusion2() {
        assertFalse(new PermutationInString().checkInclusion("eidboaoo", "ab"));
    }
}