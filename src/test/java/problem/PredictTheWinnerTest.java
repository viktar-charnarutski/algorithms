package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PredictTheWinnerTest {

    @Test
    public void predictTheWinner1() {
        assertFalse(new PredictTheWinner().predictTheWinner(new int[]{1, 5, 2}));
    }

    @Test
    public void predictTheWinner2() {
        assertTrue(new PredictTheWinner().predictTheWinner(new int[]{1, 5, 233, 2}));
    }

    @Test
    public void predictTheWinner3() {
        assertTrue(new PredictTheWinner().predictTheWinner(new int[]{1, 5, 233}));
    }
}