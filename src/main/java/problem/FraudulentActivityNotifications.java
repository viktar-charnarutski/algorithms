package problem;

import java.util.Arrays;

/**
 * Fraudulent Activity Notifications
 * <p>
 * HackerLand National Bank has a simple policy for warning clients about possible fraudulent account activity.
 * If the amount spent by a client on a particular day is greater than or equal to 2x the client's median spending for a
 * trailing number of days, they send the client a notification about potential fraud. The bank doesn't send the client
 * any notifications until they have at least that trailing number of prior days' transaction data.
 * <p>
 * Given the number of trailing days d and a client's total daily expenditures for a period of n days, find and print the
 * number of times the client will receive a notification over all n days.
 */
public class FraudulentActivityNotifications {
    static int activityNotifications(int[] expenditure, int d) {
        if (expenditure.length < d) return 0;
        int currMedian, notificationsCount = 0;
        for (int i = d; i < expenditure.length; i++) {
            currMedian = median(expenditure, i - d, d);
            if (expenditure[i] >= currMedian * 2) {
                notificationsCount++;
            }
        }
        return notificationsCount;
    }

    static int median(int[] arr, int start, int d) {
        int[] range = new int[d];
        System.arraycopy(arr, start, range, 0, d);
        Arrays.sort(range);
        int midIndex = d / 2;
        if (d % 2 == 0) {
            return ((range[midIndex] + range[midIndex + 1])) / 2 ;
        } else {
            return range[midIndex];
        }
    }
}
