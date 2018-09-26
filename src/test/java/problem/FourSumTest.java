package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FourSumTest {

    @Test
    public void fourSum1() {
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

    @Test
    public void fourSum2() {
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list2.add(-3);
        list2.add(-2);
        list2.add(2);
        list2.add(3);
        expected.add(list2);
        List<Integer> list3 = new ArrayList<>();
        list3.add(-3);
        list3.add(-1);
        list3.add(1);
        list3.add(3);
        expected.add(list3);
        List<Integer> list1 = new ArrayList<>();
        list1.add(-3);
        list1.add(0);
        list1.add(0);
        list1.add(3);
        expected.add(list1);
        List<Integer> list4 = new ArrayList<>();
        list4.add(-3);
        list4.add(0);
        list4.add(1);
        list4.add(2);
        expected.add(list4);
        List<Integer> list5 = new ArrayList<>();
        list5.add(-2);
        list5.add(-1);
        list5.add(0);
        list5.add(3);
        expected.add(list5);
        List<Integer> list6 = new ArrayList<>();
        list6.add(-2);
        list6.add(-1);
        list6.add(1);
        list6.add(2);
        expected.add(list6);
        List<Integer> list7 = new ArrayList<>();
        list7.add(-2);
        list7.add(0);
        list7.add(0);
        list7.add(2);
        expected.add(list7);
        List<Integer> list8 = new ArrayList<>();
        list8.add(-1);
        list8.add(0);
        list8.add(0);
        list8.add(1);
        expected.add(list8);
        assertEquals(expected, new FourSum().fourSum(new int[]{-3, -2, -1, 0, 0, 1, 2, 3}, 0));
    }
}