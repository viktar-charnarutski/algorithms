package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class UglyNumberTest {

    @Test
    public void isUgly1() {
        assertTrue(new UglyNumber().isUgly(6));
    }

    @Test
    public void isUgly2() {
        assertTrue(new UglyNumber().isUgly(8));
    }

    @Test
    public void isUgly3() {
        assertFalse(new UglyNumber().isUgly(14));
    }

    @Test
    public void isUgly4() {
        assertFalse(new UglyNumber().isUgly(0));
    }
}