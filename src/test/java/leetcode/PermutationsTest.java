package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PermutationsTest {

    @Test
    public void permuteUnique() {
        List<List<Integer>> expected = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(1);
        l1.add(2);
        expected.add(l1);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(1);
        expected.add(l2);
        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(2);
        l3.add(1);
        l3.add(1);
        expected.add(l3);
        assertEquals(expected, new PermutationsII().permuteUnique(new int[]{1, 1, 2}));
    }
}