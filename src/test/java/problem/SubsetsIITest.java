package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SubsetsIITest {

    @Test
    public void subsetsWithDup1() {
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> list6 = new ArrayList<>();
        expected.add(list6);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        expected.add(list2);
        List<Integer> list5 = new ArrayList<>();
        list5.add(1);
        list5.add(2);
        expected.add(list5);
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(2);
        expected.add(list3);
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        expected.add(list1);
        List<Integer> list4 = new ArrayList<>();
        list4.add(2);
        list4.add(2);
        expected.add(list4);
        assertEquals(expected, new SubsetsII().subsetsWithDup(new int[]{1, 2, 2}));
    }

    @Test
    public void subsetsWithDup2() {

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
        assertEquals(expected, new SubsetsII().subsetsWithDup(new int[]{1, 2, 3}));
    }
}