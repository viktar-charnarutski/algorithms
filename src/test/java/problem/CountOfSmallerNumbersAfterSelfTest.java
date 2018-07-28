package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CountOfSmallerNumbersAfterSelfTest {

    @Test
    public void countSmaller() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(1);
        expected.add(1);
        expected.add(0);
        assertEquals(expected, new CountOfSmallerNumbersAfterSelf().countSmaller(new int[]{5, 2, 6, 1}));
    }
}