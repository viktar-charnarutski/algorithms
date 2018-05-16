package leetcode;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MinimumTimeDifferenceTest {

    @Test
    public void findMinDifference1() {
        ArrayList<String> input = new ArrayList<>();
        input.add("00:04");
        input.add("00:06");
        input.add("00:20");
        input.add("01:04");
        input.add("22:04");
        assertEquals(2, new MinimumTimeDifference().findMinDifference(input));
    }

    @Test
    public void findMinDifference2() {
        ArrayList<String> input = new ArrayList<>();
        input.add("00:00");
        input.add("00:04");
        input.add("00:06");
        input.add("00:20");
        input.add("01:04");
        input.add("22:04");
        input.add("23:59");
        assertEquals(1, new MinimumTimeDifference().findMinDifference(input));
    }

    @Test
    public void minDiff() {
        assertEquals(2, new MinimumTimeDifference().minDiff(new int[]{1, 6, 4, 10}));
    }

    @Test
    public void timeToMin() {
        assertEquals(100, new MinimumTimeDifference().timeToMin("01:40"));
    }
}