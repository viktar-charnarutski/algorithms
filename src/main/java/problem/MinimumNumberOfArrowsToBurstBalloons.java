package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 452. Minimum Number of Arrows to Burst Balloons
 * <p>
 * There are a number of spherical balloons spread in two-dimensional space.
 * For each balloon, provided input is the start and end coordinates of the horizontal diameter.
 * Since it's horizontal, y-coordinates don't matter and hence the x-coordinates of start
 * and end of the diameter suffice. Start is always smaller than end. There will be at most 104 balloons.
 * <p>
 * An arrow can be shot up exactly vertically from different points along the x-axis.
 * A balloon with xstart and xend bursts by an arrow shot at x if xstart ≤ x ≤ xend.
 * There is no limit to the number of arrows that can be shot. An arrow once shot keeps travelling up infinitely.
 * The problem is to find the minimum number of arrows that must be shot to burst all balloons.
 */
public class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) return 0;

        List<int[]> list = new ArrayList<>(Arrays.asList(points));
        list.sort((p1, p2) -> (p1[1] - p2[1]));

        int intercepts = 0;
        int end = list.get(0)[1];
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i)[0] <= end) {
                intercepts++;
            } else {
                end = list.get(i)[1];
            }
        }
        return list.size() - intercepts;
    }
}
