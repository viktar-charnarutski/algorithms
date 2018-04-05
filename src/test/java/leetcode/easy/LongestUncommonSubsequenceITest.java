package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestUncommonSubsequenceITest {

    @Test
    public void findLUSlength() {
        assertTrue(-1 == new LongestUncommonSubsequenceI().findLUSlength("abc", "abc"));
        assertTrue(3 == new LongestUncommonSubsequenceI().findLUSlength("abc", "def"));
        assertTrue(4 == new LongestUncommonSubsequenceI().findLUSlength("abcd", "def"));
    }
}