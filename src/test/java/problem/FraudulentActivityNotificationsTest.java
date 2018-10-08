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
    public void median4() {
        assertEquals(4, FraudulentActivityNotifications.median(new int[]{0, 0, 2, 2, 2, 1, 1, 0, 1, 0}, 10), 0);
    }

    @Test
    public void median5() {
        assertEquals(3, FraudulentActivityNotifications.median(new int[]{0, 0, 2, 2, 2, 1, 1, 0, 1, 0}, 5), 0);
    }

    @Test
    public void median6() {
        assertEquals(2, FraudulentActivityNotifications.median(new int[]{0, 1, 1, 1}, 3), 0);
    }
}