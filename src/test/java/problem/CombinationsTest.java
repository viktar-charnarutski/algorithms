package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CombinationsTest {

    @Test
    public void combine() {
        List<List<Integer>> exp = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(4);
        exp.add(l1);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(4);
        exp.add(l2);
        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(2);
        l3.add(3);
        exp.add(l3);
        ArrayList<Integer> l4 = new ArrayList<>();
        l4.add(1);
        l4.add(2);
        exp.add(l4);
        ArrayList<Integer> l5 = new ArrayList<>();
        l5.add(1);
        l5.add(3);
        exp.add(l5);
        ArrayList<Integer> l6 = new ArrayList<>();
        l6.add(1);
        l6.add(4);
        exp.add(l6);
        assertEquals(exp, new Combinations().combine(4, 2));
    }
}