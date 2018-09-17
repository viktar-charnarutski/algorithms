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

    @Test
    public void calculate3() {
        assertEquals(23, new BasicCalculator().calculate("(1+(4+5+2)-3)+(6+8)"));
    }

    @Test
    public void calculate4() {
        assertEquals(-9, new BasicCalculator().calculate("2-(5-6)"));
    }
}