package leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * 539. Minimum Time Difference
 * <p>
 * Given a list of 24-hour clock time points in "Hour:Minutes" format,
 * find the minimum minutes difference between any two time points in the list.
 */
public class MinimumTimeDifference {
    public int findMinDifference(List<String> timePoints) {
        int[] minutes = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            minutes[i] = timeToMin(timePoints.get(i));
        }
        return minDiff(minutes);
    }

    public int minDiff(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(arr[i] - arr[i - 1], minDiff);
        }
        minDiff = Math.min((arr[0] + 1440) - arr[arr.length - 1], minDiff);
        return minDiff;
    }

    public int timeToMin(String time) {
        String[] hhmm = time.split(":");
        int hh = Integer.valueOf(hhmm[0]);
        int mm = Integer.valueOf(hhmm[1]);
        return (hh * 60) + mm;
    }
}
