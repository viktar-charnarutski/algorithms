package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 *
 */
public class ImplementStrStrTest {

    @Test
    public void strStr() {
        ImplementStrStr ins = new ImplementStrStr();
        assertTrue(2 == ins.strStr("hello", "ll"));
        assertTrue(-1 == ins.strStr("aaaaa", "ll"));
        assertTrue(0 == ins.strStr("a", "a"));
        assertTrue(-1 == ins.strStr(" ", "a"));
        assertTrue(-1 == ins.strStr(" ", "  "));
        assertTrue(0 == ins.strStr("  ", " "));
        assertTrue(0 == ins.strStr("a", ""));
        assertTrue(0 == ins.strStr("aaa", "a"));
        assertTrue(9 == ins.strStr("mississippi", "pi"));
    }
}