package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudulentActivityNotificationsTest {

    @Test
    public void activityNotifications() {
        assertEquals(2, FraudulentActivityNotifications.activityNotifications(new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5}, 5));
    }

    @Test
    public void median() {
        assertEquals(3, FraudulentActivityNotifications.median(new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5}, 0, 5));
    }
}