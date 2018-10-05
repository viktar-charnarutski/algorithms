package problem;

import java.util.LinkedList;
import java.util.Queue;

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

    // 2 3 4 2 3 6 8 4 5
    // 2 2 3 3 4 4 5 6 8
    // 0 0 2 2 2 1 1 0 1
    /*

    0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10
    -------------------------------------------
    0 | 0 | 2 | 2 | 2 | 1 | 1 | 0 | 1 | 0 | 0 |

     */

    static int activityNotifications(int[] expenditure, int d) {
        if (expenditure.length < d) return 0;
        int notificationsCount = 0;

        Queue<Integer> queue = new LinkedList<>();
        int[] counts = new int[200];

        for (int currElement : expenditure) {
            // if have enough data
            if (queue.size() >= d) {
                int median = median(counts, d);
                if (currElement >= median * 2) {
                    notificationsCount++;
                }
                // 'removing' the 'i - d'-th element from the counting array
                int oldestElement = queue.poll();
                counts[oldestElement]--;
            }

            // 'adding' the current element into the counting array
            counts[currElement]++;
            queue.offer(currElement);
        }
        return notificationsCount;
    }

    static int median(int[] counts, int d) {
        int mid = d / 2 + 1;
        if (d % 2 == 0) { // even: get avg of the two middle elements
            int midFirst = 0, midSecond = 0;
            int currIndex = 0, count = 0;
            while (currIndex < counts.length) {
                for (int i = 0; i < counts[currIndex]; i++) {
                    count++;
                    if (count == mid - 1) {
                        midFirst = currIndex;
                    } else if (count == mid) {
                        midSecond = currIndex;
                        return (midFirst + midSecond) / 2;
                    }
                }
                currIndex++;
            }
        } else {
            int currIndex = 0, count = 0;
            while (currIndex < counts.length) {
                for (int i = 0; i < counts[currIndex]; i++) {
                    if (++count == mid) return currIndex;
                }
                currIndex++;
            }
        }
        return -1;
    }
}
