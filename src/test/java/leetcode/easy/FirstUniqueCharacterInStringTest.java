package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstUniqueCharacterInStringTest {

    @Test
    public void firstUniqChar() {
        FirstUniqueCharacterInString ins = new FirstUniqueCharacterInString();
        assertTrue(0 == ins.firstUniqChar("leetcode"));
        assertTrue(2 == ins.firstUniqChar("loveleetcode"));
        assertTrue(9 == ins.firstUniqChar("eeeeeeeeeo"));
    }
}