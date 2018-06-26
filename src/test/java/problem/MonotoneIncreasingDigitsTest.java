package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonotoneIncreasingDigitsTest {

    @Test
    public void monotoneIncreasingDigits1() {
        assertEquals(9, new MonotoneIncreasingDigits().monotoneIncreasingDigits(10));
    }

    @Test
    public void monotoneIncreasingDigits2() {
        assertEquals(1234, new MonotoneIncreasingDigits().monotoneIncreasingDigits(1234));
    }

    @Test
    public void monotoneIncreasingDigits3() {
        assertEquals(299, new MonotoneIncreasingDigits().monotoneIncreasingDigits(332));
    }
}