package problem;

import org.junit.Test;

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
    public void median1() {
        assertEquals(3, FraudulentActivityNotifications.median(new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5}, 0, 5));
    }

    @Test
    public void median2() {
        assertEquals(4, FraudulentActivityNotifications.median(new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5}, 3, 5));
    }
}