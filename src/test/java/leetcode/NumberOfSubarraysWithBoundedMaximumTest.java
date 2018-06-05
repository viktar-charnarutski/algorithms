package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfSubarraysWithBoundedMaximumTest {

    @Test
    public void numSubarrayBoundedMax1() {
        assertEquals(3, new NumberOfSubarraysWithBoundedMaximum().numSubarrayBoundedMax(new int[]{2, 1, 4, 3}, 2, 3));
    }

    @Test
    public void numSubarrayBoundedMax2() {
        assertEquals(7, new NumberOfSubarraysWithBoundedMaximum().numSubarrayBoundedMax(new int[]{2, 9, 2, 5, 6}, 2, 8));
    }
}