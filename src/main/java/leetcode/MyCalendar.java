package leetcode;

import java.util.TreeMap;

/**
 * 729. My Calendar I
 * <p>
 * Implement a MyCalendar class to store your events. A new event can be added if adding
 * the event will not cause a double booking.
 * <p>
 * Your class will have the method, book(int start, int end). Formally, this represents a booking on
 * the half open interval [start, end), the range of real numbers x such that start <= x < end.
 * <p>
 * A double booking happens when two events have some non-empty intersection (ie., there is some time that is common
 * to both events.)
 * <p>
 * For each call to the method MyCalendar.book, return true if the event can be added to the calendar successfully
 * without causing a double booking. Otherwise, return false and do not add the event to the calendar.
 * <p>
 * Your class will be called like this: MyCalendar cal = new MyCalendar(); MyCalendar.book(start, end)
 */
public class MyCalendar {

    private TreeMap<Integer, Integer> cal;

    public MyCalendar() {
        cal = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer prev = cal.floorKey(start);
        Integer next = cal.ceilingKey(start);
        if ((prev == null || cal.get(prev) <= start)
                && (next == null || end < next)) {
            cal.put(start, end);
            return true;
        }
        return false;
    }
}
