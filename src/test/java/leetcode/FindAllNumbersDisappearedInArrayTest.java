package leetcode;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class FindAllNumbersDisappearedInArrayTest {

    @Test
    public void findDisappearedNumbers() {
        FindAllNumbersDisappearedInArray ins = new FindAllNumbersDisappearedInArray();
        ArrayList<Integer> expected1 = new ArrayList<>();
        expected1.add(5);
        expected1.add(6);

        ArrayList<Integer> expected2 = new ArrayList<>();
        expected2.add(2);

        ArrayList<Integer> expected3 = new ArrayList<>();
        expected3.add(4);

        assertEquals(expected1, ins.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
//        assertEquals(expected2, ins.findDisappearedNumbers(new int[]{1, 1}));
//        assertEquals(expected3, ins.findDisappearedNumbers(new int[]{1, 2, 3, 5, 5}));

    }
}