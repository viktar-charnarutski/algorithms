package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SubsetSumTest {

    @Test
    public void subsetSum_true() {
        assertTrue(new SubsetSum().subsetSum(new int[]{3, 34, 4, 12, 5, 2}, 9));
    }

    @Test
    public void subsetSum_false() {
        assertFalse(new SubsetSum().subsetSum(new int[]{3, 34, 4, 12, 5, 2}, 13));
    }
}