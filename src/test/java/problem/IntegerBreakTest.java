package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerBreakTest {

    @Test
    public void integerBreak1() {
        assertEquals(36, new IntegerBreak().integerBreak(10));
    }

    @Test
    public void integerBreak2() {
        assertEquals(1, new IntegerBreak().integerBreak(1));
    }
}