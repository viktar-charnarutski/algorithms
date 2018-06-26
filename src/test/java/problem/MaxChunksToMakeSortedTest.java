package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxChunksToMakeSortedTest {

    @Test
    public void maxChunksToSorted() {
        MaxChunksToMakeSorted ins = new MaxChunksToMakeSorted();
        assertEquals(1, ins.maxChunksToSorted(new int[]{4, 3, 2, 1, 0}));
    }

    @Test
    public void maxChunksToSorted1() {
        MaxChunksToMakeSorted ins = new MaxChunksToMakeSorted();
        assertEquals(4, ins.maxChunksToSorted(new int[]{1, 0, 2, 3, 4}));
    }

    @Test
    public void maxChunksToSorted2() {
        MaxChunksToMakeSorted ins = new MaxChunksToMakeSorted();
        assertEquals(4, ins.maxChunksToSorted(new int[]{1, 0, 2, 3, 4, 6, 9, 7, 8}));
    }
}