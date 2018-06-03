package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumLengthOfRepeatedSubarrayTest {

    @Test
    public void findLength() {
        assertEquals(3, new MaximumLengthOfRepeatedSubarray().findLength(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7}));
    }
}