package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NonDecreasingArrayTest {

    @Test
    public void checkPossibility_true() {
        NonDecreasingArray ins = new NonDecreasingArray();
        assertTrue(ins.checkPossibility(new int[]{4, 2, 3}));
    }

    @Test
    public void checkPossibility_false() {
        NonDecreasingArray ins = new NonDecreasingArray();
        assertFalse(ins.checkPossibility(new int[]{4, 2, 1}));
    }

    @Test
    public void checkPossibility_false2() {
        NonDecreasingArray ins = new NonDecreasingArray();
        assertFalse(ins.checkPossibility(new int[]{3, 4, 2, 3}));
    }

    @Test
    public void checkPossibility_true1() {
        NonDecreasingArray ins = new NonDecreasingArray();
        assertTrue(ins.checkPossibility(new int[]{4, 2, 3}));
    }
}