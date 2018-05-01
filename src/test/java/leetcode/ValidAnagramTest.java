package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidAnagramTest {

    private ValidAnagram ins = new ValidAnagram();

    @Test
    public void isAnagram() {
        assertTrue(ins.isAnagram("anagram", "nagaram"));
        assertFalse(ins.isAnagram("rat", "cat"));
    }
}