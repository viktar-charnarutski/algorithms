package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PowerOfTwoTest {

    @Test
    public void isPowerOfTwo_true() {
        PowerOfTwo ins = new PowerOfTwo();
        assertTrue(ins.isPowerOfTwo(2));
        assertTrue(ins.isPowerOfTwo(256));
        assertTrue(ins.isPowerOfTwo(4_096));
        assertTrue(ins.isPowerOfTwo(16_777_216));
    }

    @Test
    public void isPowerOfTwo_false() {
        PowerOfTwo ins = new PowerOfTwo();
        assertFalse(ins.isPowerOfTwo(3));
        assertFalse(ins.isPowerOfTwo(257));
        assertFalse(ins.isPowerOfTwo(4_097));
        assertFalse(ins.isPowerOfTwo(16_777_217));
    }

    @Test
    public void isPowerOfTwo_zero_input() {
        PowerOfTwo ins = new PowerOfTwo();
        assertFalse(ins.isPowerOfTwo(0));
    }
}