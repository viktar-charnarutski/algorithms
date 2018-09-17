package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasicCalculatorTest {

    @Test
    public void calculate1() {
        assertEquals(5, new BasicCalculator().calculate("2+3"));
    }

    @Test
    public void calculate2() {
        assertEquals(3, new BasicCalculator().calculate("2-1 + 2 "));
    }
}