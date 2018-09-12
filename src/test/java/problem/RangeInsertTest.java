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

    @Test
    public void insertRange2() {
        ArrayList<Interval> input = new ArrayList<>();
        input.add(new Interval(0, 1));
        input.add(new Interval(4, 5));

        ArrayList<Interval> expected = new ArrayList<>();
        input.add(new Interval(0, 1));
        input.add(new Interval(2, 3));
        input.add(new Interval(4, 5));

        assertEquals(expected, RangeInsert.insertRange(input, new Interval(2, 3)));
    }

    @Test
    public void insertRange3() {
        ArrayList<Interval> input = new ArrayList<>();

        ArrayList<Interval> expected = new ArrayList<>();
        input.add(new Interval(0, 1));

        assertEquals(expected, RangeInsert.insertRange(input, new Interval(0, 1)));
    }

    @Test
    public void insertRange4() {
        ArrayList<Interval> input = new ArrayList<>();
        input.add(new Interval(0, 5));

        ArrayList<Interval> expected = new ArrayList<>();
        input.add(new Interval(0, 5));

        assertEquals(expected, RangeInsert.insertRange(input, new Interval(1, 2)));
    }

    @Test
    public void insertRange5() {
        ArrayList<Interval> input = new ArrayList<>();
        input.add(new Interval(1, 2));
        input.add(new Interval(3, 5));
        input.add(new Interval(6, 9));
        input.add(new Interval(6, 7));
        input.add(new Interval(8, 10));
        input.add(new Interval(12, 14));

        ArrayList<Interval> expected = new ArrayList<>();
        input.add(new Interval(1, 2));
        input.add(new Interval(3, 10));
        input.add(new Interval(12, 14));

        assertEquals(expected, RangeInsert.insertRange(input, new Interval(5, 9)));
    }

    @Test
    public void insertRange6() {
        ArrayList<Interval> input = new ArrayList<>();
        input.add(new Interval(-10, -5));
        input.add(new Interval(0, 10));

        ArrayList<Interval> expected = new ArrayList<>();
        input.add(new Interval(-10, -5));
        input.add(new Interval(-2, -1));
        input.add(new Interval(0, 10));

        assertEquals(expected, RangeInsert.insertRange(input, new Interval(-2, -1)));
    }

    @Test
    public void insertRange_merge1() {
        assertEquals(new Interval(-2, 2), RangeInsert.merge(new Interval(-2, 0), new Interval(-1, 2)));
    }

    @Test
    public void insertRange_merge2() {
        assertEquals(new Interval(-2, 2), RangeInsert.merge(new Interval(-2, 2), new Interval(-1, 1)));
    }

    @Test
    public void insertRange_isOverlapping1() {
        assertTrue(RangeInsert.isOverlapping(new Interval(-2, 0), new Interval(-1, 2)));
    }

    @Test
    public void insertRange_isOverlapping2() {
        assertTrue(RangeInsert.isOverlapping(new Interval(-2, 2), new Interval(-1, 1)));
    }
}