package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumLengthOfRepeatedSubarrayTest {

    @Test
    public void findLength1() {
        assertEquals(3, new MaximumLengthOfRepeatedSubarray().findLength(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7}));
    }

    @Test
    public void findLength2() {
        assertEquals(1, new MaximumLengthOfRepeatedSubarray().findLength(new int[]{1, 2, 3, 4, 5}, new int[]{3, 2, 1, 4, 7}));
    }

    @Test
    public void findLength3() {
        assertEquals(0, new MaximumLengthOfRepeatedSubarray().findLength(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 0}));
    }
}