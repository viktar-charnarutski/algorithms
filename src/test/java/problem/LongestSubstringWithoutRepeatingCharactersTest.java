package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void lengthOfLongestSubstring1() {
        assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb"));
    }
    @Test
    public void lengthOfLongestSubstring2() {

        assertEquals(1, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb"));
    }
    @Test
    public void lengthOfLongestSubstring3() {
        assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void lengthOfLongestSubstring_one_char() {
        assertEquals(1, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("a"));
    }

    @Test
    public void lengthOfLongestSubstring_null() {
        assertEquals(0, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(null));
    }

    @Test
    public void lengthOfLongestSubstring_empty() {
        assertEquals(0, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(""));
    }
}