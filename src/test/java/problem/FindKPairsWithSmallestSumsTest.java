package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class FindKPairsWithSmallestSumsTest {

    @Test
    public void kSmallestPairs1() {
        List<int[]> expected = new ArrayList<>();
        expected.add(new int[]{1, 2});
        expected.add(new int[]{1, 4});
        expected.add(new int[]{1, 6});
        List<int[]> actual = new FindKPairsWithSmallestSums().kSmallestPairs(new int[]{1, 7, 11}, new int[]{2, 4, 6}, 3);
        assertArrayEquals(expected.get(0), actual.get(0));
        assertArrayEquals(expected.get(1), actual.get(1));
        assertArrayEquals(expected.get(2), actual.get(2));
    }

    @Test
    public void kSmallestPairs2() {
        List<int[]> expected = new ArrayList<>();
        expected.add(new int[]{1, 1});
        expected.add(new int[]{1, 1});
        List<int[]> actual = new FindKPairsWithSmallestSums().kSmallestPairs(new int[]{1, 1, 2}, new int[]{1, 2, 3}, 2);
        assertArrayEquals(expected.get(0), actual.get(0));
        assertArrayEquals(expected.get(1), actual.get(1));
    }

    @Test
    public void kSmallestPairs3() {
        List<int[]> expected = new ArrayList<>();
        expected.add(new int[]{1, 3});
        expected.add(new int[]{2, 3});
        List<int[]> actual = new FindKPairsWithSmallestSums().kSmallestPairs(new int[]{1, 2}, new int[]{3}, 3);
        assertArrayEquals(expected.get(0), actual.get(0));
        assertArrayEquals(expected.get(1), actual.get(1));
    }
}