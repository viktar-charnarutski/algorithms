package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OptimalDivisionTest {

    @Test
    public void optimalDivision() {
        OptimalDivision ins = new OptimalDivision();
        assertEquals("1000/(100/10/2)", ins.optimalDivision(new int[]{1000, 100, 10, 2}));
    }
}