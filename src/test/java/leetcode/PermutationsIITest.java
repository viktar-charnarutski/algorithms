package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PermutationsIITest {

    @Test
    public void permute() {
        List<List<Integer>> expected = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        expected.add(l1);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(3);
        l2.add(2);
        expected.add(l2);
        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(2);
        l3.add(1);
        l3.add(3);
        expected.add(l3);
        ArrayList<Integer> l4 = new ArrayList<>();
        l4.add(2);
        l4.add(3);
        l4.add(1);
        expected.add(l4);
        ArrayList<Integer> l5 = new ArrayList<>();
        l5.add(3);
        l5.add(1);
        l5.add(2);
        expected.add(l5);
        ArrayList<Integer> l6 = new ArrayList<>();
        l6.add(3);
        l6.add(2);
        l6.add(1);
        expected.add(l6);
        assertEquals(expected, new Permutations().permute(new int[]{1, 2, 3}));
    }
}