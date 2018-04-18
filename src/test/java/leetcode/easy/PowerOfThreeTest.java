package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PowerOfThreeTest {

    @Test
    public void isPowerOfThree_true() {
        PowerOfThree ins = new PowerOfThree();
        assertTrue(ins.isPowerOfThree(3));
        assertTrue(ins.isPowerOfThree(177147));
        assertTrue(ins.isPowerOfThree(43046721));
        assertTrue(ins.isPowerOfThree(1162261467));
    }

    @Test
    public void isPowerOfThree_false() {
        PowerOfThree ins = new PowerOfThree();
        assertFalse(ins.isPowerOfThree(2));
        assertFalse(ins.isPowerOfThree(256));
        assertFalse(ins.isPowerOfThree(4_096));
        assertFalse(ins.isPowerOfThree(16_777_216));
    }

    @Test
    public void PowerOfThree() {
        PowerOfThree ins = new PowerOfThree();
        assertFalse(ins.isPowerOfThree(0));
    }
}