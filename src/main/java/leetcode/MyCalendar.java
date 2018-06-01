package leetcode;

import java.util.ArrayList;
import java.util.List;

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

    private List<int[]> cal;

    public MyCalendar() {
        cal = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        if (checkAllEvents(start, end)) {
            cal.add(new int[]{start, end});
            return true;
        }
        return false;
    }

    private boolean checkAllEvents(int start, int end) {
        for (int[] event : cal) {
            if (event[0] <= end && start < event[1]) {
                return false;
            }
        }
        return true;
    }
}
