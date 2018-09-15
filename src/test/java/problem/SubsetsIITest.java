package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SubsetsIITest {

    @Test
    public void subsetsWithDup1() {
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        expected.add(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        expected.add(list2);
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(2);
        expected.add(list3);
        List<Integer> list4 = new ArrayList<>();
        list4.add(2);
        list4.add(2);
        expected.add(list4);
        List<Integer> list5 = new ArrayList<>();
        list5.add(1);
        list5.add(2);
        expected.add(list5);
        List<Integer> list6 = new ArrayList<>();
        expected.add(list6);
        assertEquals(expected, new SubsetsII().subsetsWithDup(new int[]{1, 2, 2}));
    }
}