package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthLargestElementInAnArrayTest {

    @Test
    public void findKthLargest1() {
        assertEquals(5, new KthLargestElementInAnArray().findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    public void findKthLargest2() {
        assertEquals(4, new KthLargestElementInAnArray().findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}