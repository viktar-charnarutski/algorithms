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
}