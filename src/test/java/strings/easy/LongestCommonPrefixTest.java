package strings.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {
        LongestCommonPrefix ins = new LongestCommonPrefix();
        assertEquals("pref", ins.longestCommonPrefix(new String[]{"preffix", "prefert", "prefop", "prefaxc" }));
    }
}