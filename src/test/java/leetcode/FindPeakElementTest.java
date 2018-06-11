package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindPeakElementTest {

    @Test
    public void findPeakElement() {
        assertEquals(2, new FindPeakElement().findPeakElement(new int[]{1, 2, 3, 1}));
    }
}