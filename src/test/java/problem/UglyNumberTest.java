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
}