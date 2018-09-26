package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FourSumTest {

    @Test
    public void fourSum() {
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list2.add(-2);
        list2.add(-1);
        list2.add(1);
        list2.add(2);
        expected.add(list2);
        List<Integer> list3 = new ArrayList<>();
        list3.add(-2);
        list3.add(0);
        list3.add(0);
        list3.add(2);
        expected.add(list3);
        List<Integer> list1 = new ArrayList<>();
        list1.add(-1);
        list1.add(0);
        list1.add(0);
        list1.add(1);
        expected.add(list1);
        assertEquals(expected, new FourSum().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
    }
}