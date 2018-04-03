package strings.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateStringTest {

    @Test
    public void rotateString() {
        RotateString ins = new RotateString();

        assertTrue(ins.rotateString("abcde", "cdeab"));
        assertFalse(ins.rotateString("abcde", "abced"));
        assertTrue(ins.rotateString("", ""));
    }
}