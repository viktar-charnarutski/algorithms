package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class UglyNumberIITest {

    @Test
    public void nthUglyNumber1() {
        assertEquals(12, new UglyNumberII().nthUglyNumber(10));
    }

    @Test
    public void nthUglyNumber2() {
        assertEquals(15, new UglyNumberII().nthUglyNumber(11));
    }
}