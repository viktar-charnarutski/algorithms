package problem;

import java.util.ArrayList;

/**
 * Mobile Game Range Module - Inserting Ranges
 * <p>
 * A Range Module is a module that tracks ranges of numbers. Range modules are used extensively when designing scalable
 * online game maps with millions of players. Your task is to write a method - insertRange that takes in an ArrayList
 * of sorted, non-overlapping integer Interval s (aka ranges) and a new Interval - insert, and returns an ArrayList of
 * sorted Interval s where insert has been added to the ArrayList in the correct spot and the required overlapping
 * ranges have been merged. The Interval class is available by clicking Use Me. Target a time complexity of O(n).
 * <p>
 * Note:
 * a) [1,3] represents an interval that includes 1, 2 and 3.
 * b) Intervals should be sorted based on the value of start
 * c) The words Range and Interval are used interchangeably
 */
public class RangeInsert {
    public static ArrayList<Interval> insertRange(ArrayList<Interval> intervalsList, Interval insert) {
        return new ArrayList<>();
    }

    static Interval merge(Interval a, Interval b) {
        return new Interval(a.start < b.start ? a.start : b.start, a.end > b.end ? a.end : b.end);
    }
}
