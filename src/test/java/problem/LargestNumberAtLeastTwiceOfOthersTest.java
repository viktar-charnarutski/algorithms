package problem;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class LargestNumberAtLeastTwiceOfOthersTest {

    @Test
    public void dominantIndex() {
        LargestNumberAtLeastTwiceOfOthers ins = new LargestNumberAtLeastTwiceOfOthers();

        assertSame(1, ins.dominantIndex(new int[]{3, 6, 1, 0}));
        assertSame(-1, ins.dominantIndex(new int[]{1, 2, 3, 4}));
        assertSame(3, ins.dominantIndex(new int[]{0, 0, 0, 1}));
        assertSame(0, ins.dominantIndex(new int[]{1}));
        assertSame(-1, ins.dominantIndex(new int[]{0, 0, 3, 2}));
        assertSame(-1, ins.dominantIndex(new int[]{2, 0, 0, 3}));
    }
}