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
        assertEquals(8, new Sqrtx().mySqrt(2));
    }

    @Test
    public void mySqrt3() {
        assertEquals(1, new Sqrtx().mySqrt(1));
    }
}