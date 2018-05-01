package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RotateStringTest {

    @Test
    public void rotateString() {
        RotateString ins = new RotateString();

        assertTrue(ins.rotateString("abcde", "cdeab"));
        assertFalse(ins.rotateString("abcde", "abced"));
        assertTrue(ins.rotateString("", ""));
    }
}