package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OptimalStrategyTest {

    @Test
    public void maxPossibleAmount() {
        assertEquals(14, new OptimalStrategy().maxPossibleAmount(new int[]{4, 3, 10, 1}));
    }
}