package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonOverlappingIntervalsTest {

    @Test
    public void eraseOverlapIntervals1() {
        Interval i1 = new Interval(1, 2);
        Interval i2 = new Interval(2, 3);
        Interval i3 = new Interval(3, 4);
        Interval i4 = new Interval(1, 3);
        Interval[] is = new Interval[]{i1, i2, i3, i4};
        assertEquals(1, new NonOverlappingIntervals().eraseOverlapIntervals(is));
    }

    @Test
    public void eraseOverlapIntervals2() {
        Interval i1 = new Interval(1, 3);
        Interval i2 = new Interval(3, 5);
        Interval i3 = new Interval(5, 7);
        Interval i4 = new Interval(2, 3);
        Interval[] is = new Interval[]{i1, i2, i3, i4};
        assertEquals(1, new NonOverlappingIntervals().eraseOverlapIntervals(is));
    }

    @Test
    public void eraseOverlapIntervals3() {
        Interval i1 = new Interval(1, 4);
        Interval i2 = new Interval(4, 5);
        Interval i3 = new Interval(5, 7);
        Interval i4 = new Interval(2, 3);
        Interval[] is = new Interval[]{i1, i2, i3, i4};
        assertEquals(1, new NonOverlappingIntervals().eraseOverlapIntervals(is));
    }

    @Test
    public void eraseOverlapIntervals4() {
        Interval i1 = new Interval(2, 4);
        Interval i2 = new Interval(4, 5);
        Interval i3 = new Interval(5, 7);
        Interval i4 = new Interval(1, 7);
        Interval[] is = new Interval[]{i1, i2, i3, i4};
        assertEquals(1, new NonOverlappingIntervals().eraseOverlapIntervals(is));
    }
}