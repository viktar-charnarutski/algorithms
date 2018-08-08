package problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 539. Minimum Time Difference
 * <p>
 * Given a list of 24-hour clock time points in "Hour:Minutes" format,
 * find the minimum minutes difference between any two time points in the list.
 */
public class MinimumTimeDifference {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> timePointsList = new ArrayList<>();
        for (String time : timePoints) {
            timePointsList.add(toMinutes(time));
        }
        return minDiff(timePointsList);
    }

    static int minDiff(List<Integer> timePointsList) {
        Collections.sort(timePointsList);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < timePointsList.size(); i++) {
            int currDiff = timePointsList.get(i) - timePointsList.get(i - 1);
            minDiff = Math.min(minDiff, currDiff);
        }
        return Math.min(minDiff, minDiffFirstLast(timePointsList.get(0), timePointsList.get(timePointsList.size() - 1)));
    }

    static int minDiffFirstLast(int first, int last) {
        return (1440 - last) + first;
    }

    static int toMinutes(String time) {
        String[] hhmm = time.split(":");
        return Integer.parseInt(hhmm[0]) * 60 + Integer.parseInt(hhmm[1]);
    }
}
