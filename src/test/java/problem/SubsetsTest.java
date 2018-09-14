package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SubsetsTest {

    @Test
    public void subsets() {
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> subset8 = new ArrayList<>();
        expected.add(subset8);

        List<Integer> subset2 = new ArrayList<>();
        subset2.add(1);
        expected.add(subset2);

        List<Integer> subset7 = new ArrayList<>();
        subset7.add(1);
        subset7.add(2);
        expected.add(subset7);

        List<Integer> subset4 = new ArrayList<>();
        subset4.add(1);
        subset4.add(2);
        subset4.add(3);
        expected.add(subset4);

        List<Integer> subset5 = new ArrayList<>();
        subset5.add(1);
        subset5.add(3);
        expected.add(subset5);

        List<Integer> subset3 = new ArrayList<>();
        subset3.add(2);
        expected.add(subset3);

        List<Integer> subset6 = new ArrayList<>();
        subset6.add(2);
        subset6.add(3);
        expected.add(subset6);

        List<Integer> subset1 = new ArrayList<>();
        subset1.add(3);
        expected.add(subset1);
        assertEquals(expected, new Subsets().subsets(new int[]{1, 2, 3}));
    }
}