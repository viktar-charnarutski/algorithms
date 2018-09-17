package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasicCalculatorTest {

    @Test
    public void calculate1() {
        assertEquals(5, new BasicCalculator().calculate("2+3"));
    }
}