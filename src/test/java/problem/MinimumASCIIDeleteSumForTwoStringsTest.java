package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumASCIIDeleteSumForTwoStringsTest {

    @Test
    public void minimumDeleteSum1() {
        MinimumASCIIDeleteSumForTwoStrings ins = new MinimumASCIIDeleteSumForTwoStrings();
        assertEquals(231, ins.minimumDeleteSum("sea", "eat"));
    }
    @Test
    public void minimumDeleteSum2() {
        MinimumASCIIDeleteSumForTwoStrings ins = new MinimumASCIIDeleteSumForTwoStrings();
        assertEquals(403, ins.minimumDeleteSum("delete", "leet"));
    }
}