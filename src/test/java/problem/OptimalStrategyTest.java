package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OptimalStrategyTest {

    @Test
    public void maxPossibleAmount1() {
        assertEquals(14, new OptimalStrategy().maxPossibleAmount(new int[]{4, 3, 10, 1}));
    }

    @Test
    public void maxPossibleAmount2() {
        assertEquals(15, new OptimalStrategy().maxPossibleAmount(new int[]{5, 3, 7, 10}));
    }
}