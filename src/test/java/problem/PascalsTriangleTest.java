package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PascalsTriangleTest {

    @Test
    public void generate1() {
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        expected.add(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        expected.add(list2);
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(1);
        expected.add(list3);
        List<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(3);
        list4.add(3);
        list4.add(1);
        expected.add(list4);
        List<Integer> list5 = new ArrayList<>();
        list5.add(1);
        list5.add(4);
        list5.add(6);
        list5.add(4);
        list5.add(1);
        expected.add(list5);

        assertEquals(expected, new PascalsTriangle().generate(5));

        //     [1],
        //    [1,1],
        //   [1,2,1],
        //  [1,3,3,1],
        // [1,4,6,4,1]
    }
}