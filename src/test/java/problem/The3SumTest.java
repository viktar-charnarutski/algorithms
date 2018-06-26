package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class The3SumTest {

    @Test
    public void threeSum1() {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(-1);
        l1.add(0);
        l1.add(1);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(-1);
        l2.add(-1);
        l2.add(2);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(l2);
        expected.add(l1);
        assertEquals(expected, new The3Sum().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    @Test
    public void threeSum2() {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(-1);
        l1.add(0);
        l1.add(1);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(l1);
        assertEquals(expected, new The3Sum().threeSum(new int[]{1, -1, -1, 0}));
    }

    @Test
    public void threeSum_all_zeros_as_input() {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(0);
        l1.add(0);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(l1);
        assertEquals(expected, new The3Sum().threeSum(new int[]{0, 0, 0}));
    }
}