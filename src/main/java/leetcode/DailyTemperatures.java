package leetcode;

import java.util.Stack;

/**
 * 739. Daily Temperatures
 * <p>
 * Given a list of daily temperatures, produce a list that, for each day in the input,
 * tells you how many days you would have to wait until a warmer temperature.
 * <p>
 * If there is no future day for which this is possible, put 0 instead.
 * <p>
 * For example, given the list temperatures = [73, 74, 75, 71, 69, 72, 76, 73],
 * your output should be [1, 1, 4, 2, 1, 1, 0, 0].
 * <p>
 * Note: The length of temperatures will be in the range [1, 30000].
 * Each temperature will be an integer in the range [30, 100].
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];

        Stack<Integer> ts = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!ts.isEmpty() && temperatures[i] > temperatures[ts.peek()]) {
                int idx = ts.pop();
                res[idx] = i - idx;
            }
            ts.push(i);
        }
        return res;
    }
}
