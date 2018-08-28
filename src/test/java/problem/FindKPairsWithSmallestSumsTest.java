package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindKPairsWithSmallestSumsTest {

    @Test
    public void kSmallestPairs1() {
        List<int[]> expected = new ArrayList<>();
        expected.add(new int[]{1, 2});
        expected.add(new int[]{1, 4});
        expected.add(new int[]{1, 6});
        assertEquals(expected, new FindKPairsWithSmallestSums().kSmallestPairs(new int[]{1, 7, 11}, new int[]{2, 4, 6}, 3));
    }
}