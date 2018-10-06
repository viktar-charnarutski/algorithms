package problem;

import org.junit.Test;

import java.util.TreeMap;

import static org.junit.Assert.*;

public class FraudulentActivityNotificationsTest {

    @Test
    public void activityNotifications1() {
        assertEquals(2, FraudulentActivityNotifications.activityNotifications(new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5}, 5));
    }

    @Test
    public void activityNotifications2() {
        assertEquals(1, FraudulentActivityNotifications.activityNotifications(new int[]{10, 20, 30, 40, 50}, 3));
    }

    @Test
    public void activityNotifications3() {
        assertEquals(0, FraudulentActivityNotifications.activityNotifications(new int[]{1, 2, 3, 4, 4}, 4));
    }

    @Test
    public void median1() {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(2, 2);
        map.put(3, 2);
        map.put(4, 2);
        map.put(5, 1);
        map.put(6, 1);
        map.put(8, 1);
        assertEquals(4, FraudulentActivityNotifications.median(map, 10), 0);
    }

    @Test
    public void median2() {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(2, 2);
        map.put(3, 2);
        map.put(4, 2);
        map.put(5, 1);
        map.put(6, 1);
        map.put(8, 1);
        assertEquals(3, FraudulentActivityNotifications.median(map, 5), 0);
    }

    @Test
    public void median3() {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(10, 1);
        map.put(20, 1);
        map.put(30, 1);
        assertEquals(20, FraudulentActivityNotifications.median(map, 3), 0);
    }
}