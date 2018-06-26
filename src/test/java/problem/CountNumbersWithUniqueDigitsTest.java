package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountNumbersWithUniqueDigitsTest {

    @Test
    public void countNumbersWithUniqueDigits0() {
        assertEquals(91, new CountNumbersWithUniqueDigits().countNumbersWithUniqueDigits(2));
    }
    @Test
    public void countNumbersWithUniqueDigits1() {
        assertEquals(739, new CountNumbersWithUniqueDigits().countNumbersWithUniqueDigits(3));
    }

    @Test
    public void countNumbersWithUniqueDigits2() {
        assertEquals(1, new CountNumbersWithUniqueDigits().countNumbersWithUniqueDigits(0));
    }
}