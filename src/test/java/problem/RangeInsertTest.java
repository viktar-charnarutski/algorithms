package problem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RangeInsertTest {

    @Test
    public void insertRange1() {
        ArrayList<Interval> input = new ArrayList<>();
        input.add(new Interval(0, 1));
        input.add(new Interval(3, 4));

        ArrayList<Interval> expected = new ArrayList<>();
        input.add(new Interval(0, 1));
        input.add(new Interval(2, 10));

        assertEquals(expected, RangeInsert.insertRange(input, new Interval(2, 10)));
    }
}