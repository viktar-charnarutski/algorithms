package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BuddyStringsTest {

    @Test
    public void buddyStrings1() {
        assertTrue(new BuddyStrings().buddyStrings("ab", "ba"));
    }

    @Test
    public void buddyStrings2() {
        assertTrue(new BuddyStrings().buddyStrings("aa", "aa"));
    }

    @Test
    public void buddyStrings3() {
        assertTrue(new BuddyStrings().buddyStrings("aaaaaaabc", "aaaaaaacb"));

    }

    @Test
    public void buddyStrings4() {
        assertFalse(new BuddyStrings().buddyStrings("", "aaaaaaacb"));
    }

    @Test
    public void buddyStrings5() {
        assertFalse(new BuddyStrings().buddyStrings("ab", "ab"));
    }

    @Test
    public void buddyStrings6() {
        assertFalse(new BuddyStrings().buddyStrings("ab", "ca"));
    }
}