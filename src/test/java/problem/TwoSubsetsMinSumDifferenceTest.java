package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSubsetsMinSumDifferenceTest {

    @Test
    public void twoSubsetsMinSumDifference() {
        assertEquals(1, new TwoSubsetsMinSumDifference().twoSubsetsMinSumDifference(new int[]{1, 6, 11, 5}));
    }
}