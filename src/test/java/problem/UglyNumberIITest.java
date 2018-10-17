package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class UglyNumberIITest {

    @Test
    public void nthUglyNumber() {
        assertEquals(12, new UglyNumberII().nthUglyNumber(10));
    }
}