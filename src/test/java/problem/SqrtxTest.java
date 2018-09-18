package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtxTest {

    @Test
    public void mySqrt1() {
        assertEquals(3, new Sqrtx().mySqrt(9));
    }

    @Test
    public void mySqrt2() {
        assertEquals(2, new Sqrtx().mySqrt(8));
    }

    @Test
    public void mySqrt3() {
        assertEquals(1, new Sqrtx().mySqrt(1));
    }

    @Test
    public void mySqrt4() {
        assertEquals(46339, new Sqrtx().mySqrt(2147395599));
    }
}