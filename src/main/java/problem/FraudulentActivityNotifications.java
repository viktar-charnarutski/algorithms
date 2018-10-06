package problem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

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
        TreeMap<Integer, Integer> countMap = new TreeMap<>();

        for (int currElement : expenditure) {
            // if have enough data
            if (queue.size() >= d) {
                double median = median(countMap, d);
                if (currElement >= median * 2) {
                    notificationsCount++;
                }
                // 'removing' the 'i - d'-th element from the counting tree map
                Integer oldestElement = queue.poll();
                if (countMap.get(oldestElement) - 1 == 0) {
                    countMap.remove(oldestElement);
                } else {
                    countMap.put(oldestElement, countMap.get(oldestElement) - 1);
                }
            }

            // 'adding' the current element into the counting tree map
            countMap.put(currElement, countMap.getOrDefault(currElement, 0) + 1);
            queue.offer(currElement);
        }
        return notificationsCount;
    }

    static double median(TreeMap<Integer, Integer> countMap, int d) {
        int mid = d / 2 + 1;
        int count = 0;
        if ((d & 1) == 0) { // even: get avg of the two middle elements
            int first = 0, second = 0;
            for (Integer num : countMap.keySet()) {
                for (int i = 0; i < countMap.get(num); i++) {
                    count++;
                    if (count == mid - 1) {
                        first = num;
                    } else if (count == mid){
                        second = num;
                        return (double) (first + second) / 2;
                    }
                }
            }
        } else {
            for (Integer num : countMap.keySet()) {
                for (int i = 0; i < countMap.get(num); i++) {
                    if (++count == mid) return num;
                }
            }
        }
        return -1;
    }
}
