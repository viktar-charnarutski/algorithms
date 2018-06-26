package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CombinationSumIVTest {

    @Test
    public void combinationSum41() {
        assertEquals(7, new CombinationSumIV().combinationSum4(new int[]{1, 2, 3}, 4));
    }

    @Test
    public void combinationSum42() {
        assertEquals(982, new CombinationSumIV().combinationSum4(new int[]{5, 1, 8}, 24));
    }
}