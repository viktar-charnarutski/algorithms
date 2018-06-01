package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyCalendarTest {

    @Test
    public void book1() {
        assertTrue(new MyCalendar().book(10, 20));
    }

    @Test
    public void book2() {
        MyCalendar cal = new MyCalendar();
        assertTrue(cal.book(10, 20));
        assertTrue(cal.book(20, 30));
    }

    @Test
    public void book3() {
        MyCalendar cal = new MyCalendar();
        assertTrue(cal.book(10, 20));
        assertFalse(cal.book(15, 25));
    }

    @Test
    public void book5() {
        MyCalendar cal = new MyCalendar();
        assertTrue(cal.book(10, 20));
        assertTrue(cal.book(20, 25));
    }

    @Test
    public void book6() {
        MyCalendar cal = new MyCalendar();
        assertTrue(cal.book(10, 20));
        assertTrue(cal.book(5, 10));
    }

    @Test
    public void book7() {
        MyCalendar cal = new MyCalendar();
        assertTrue(cal.book(10, 20));
        assertFalse(cal.book(5, 11));
    }

    @Test
    public void book8() {
        MyCalendar cal = new MyCalendar();
        assertTrue(cal.book(10, 20));
        assertTrue(cal.book(5, 9));
    }

    @Test
    public void book9() {
        MyCalendar cal = new MyCalendar();
        assertTrue(cal.book(47, 50));
        assertTrue(cal.book(33, 41));
        assertFalse(cal.book(39, 45));
        assertFalse(cal.book(33, 42));
        assertTrue(cal.book(25, 32));
        assertTrue(cal.book(19, 25));
        assertTrue(cal.book(3, 8));
        assertTrue(cal.book(8, 13));
        assertFalse(cal.book(18, 27));
    }
}