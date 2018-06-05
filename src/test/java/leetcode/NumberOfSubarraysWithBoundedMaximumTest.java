package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfSubarraysWithBoundedMaximumTest {

    @Test
    public void numSubarrayBoundedMax() {
        assertEquals(3, new NumberOfSubarraysWithBoundedMaximum().numSubarrayBoundedMax(new int[]{2, 1, 4, 3}, 2, 3));
    }
}