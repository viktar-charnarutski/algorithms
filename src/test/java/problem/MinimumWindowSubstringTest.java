package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumWindowSubstringTest {

    @Test
    public void minWindow1() {
        assertEquals("BANC", new MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    public void minWindow2() {
        assertEquals("", new MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABCX"));
    }
}