package problem;

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
        int notificationsCount = 0;

        int[] counts = new int[200];
        int first = 0;

        for (int last = 0; last < expenditure.length; last++) {
            // if have enough data: range is > d
            boolean isRangeFormed = last - first >= d;
            if (isRangeFormed) {
                double median = median(counts, d);
                if (expenditure[last] >= median * 2) { // check if the current spending is exceeding the calculated threshold
                    notificationsCount++;
                }
                // 'removing' the 'last - d'-th element from the counting array
                counts[expenditure[first]]--;
            }

            // 'adding' the current element into the counting array
            counts[expenditure[last]]++;

            if (isRangeFormed) {
                first++;
            }
        }
        return notificationsCount;
    }

    static double median(int[] counts, int d) {
        int mid = d / 2 + 1;
        int midFirst = 0, midSecond = 0;
        if ((d & 1) == 0) { // even: get avg of the two middle elements
            int count = 0;
            for (int i = 0; i < counts.length; i++) {
                count += counts[i];
                if (count >= mid - 1) {
                    midFirst = i;
                    break;
                }
            }
            count = 0;
            for (int i = 0; i < counts.length; i++) {
                count += counts[i];
                if (count >= mid) {
                    midSecond = i;
                    break;
                }
            }
            return (double) (midFirst + midSecond) / 2;
        } else { // odd: get the middle element
            int count = 0;
            for (int i = 0; i < counts.length; i++) {
                count += counts[i];
                if (count >= mid) return i;
            }
        }
        return -1.0;
    }
}
