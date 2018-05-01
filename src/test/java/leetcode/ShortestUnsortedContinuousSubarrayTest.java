package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class ShortestUnsortedContinuousSubarrayTest {

    @Test
    public void findUnsortedSubarray() {
        ShortestUnsortedContinuousSubarray ins = new ShortestUnsortedContinuousSubarray();
        assertSame(5, ins.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
    }

    @Test
    public void findUnsortedSubarray_already_sorted() {
        ShortestUnsortedContinuousSubarray ins = new ShortestUnsortedContinuousSubarray();
        assertSame(0, ins.findUnsortedSubarray(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }

    @Test
    public void findUnsortedSubarray_one() {
        ShortestUnsortedContinuousSubarray ins = new ShortestUnsortedContinuousSubarray();
        assertSame(2, ins.findUnsortedSubarray(new int[]{1, 2, 3, 5, 4, 6, 7}));
    }

    @Test
    public void findUnsortedSubarray_same_elements() {
        ShortestUnsortedContinuousSubarray ins = new ShortestUnsortedContinuousSubarray();
        assertSame(4, ins.findUnsortedSubarray(new int[]{1, 3, 2, 2, 2}));
    }

    @Test
    public void findUnsortedSubarray_same_sorted_elements() {
        ShortestUnsortedContinuousSubarray ins = new ShortestUnsortedContinuousSubarray();
        assertSame(0, ins.findUnsortedSubarray(new int[]{1, 2, 3, 3, 3}));
    }

    @Test
    public void findUnsortedSubarray_all_elements_are_the_same() {
        ShortestUnsortedContinuousSubarray ins = new ShortestUnsortedContinuousSubarray();
        assertSame(0, ins.findUnsortedSubarray(new int[]{1, 1, 1, 1, 1}));
    }
}