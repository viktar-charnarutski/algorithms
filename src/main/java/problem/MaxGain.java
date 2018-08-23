package problem;

/**
 * Max Gain
 * <p>
 * Given an array of integers, write a method - maxGain - that returns the maximum gain.
 * Maximum Gain is defined as the maximum difference between 2 elements in a list such that the larger element appears
 * after the smaller element. If no gain is possible, return 0.
 */
public class MaxGain {
    public static int maxGain(int[] a) {
        if (a == null || a.length < 2) {
            return 0;
        }
        int min = a[0], max = a[1], gain = min < max ? max - min : 0;
        for (int i = 2; i < a.length; i++) {
            if (a[i] > max) {
                min = Math.min(max, min);
                max = a[i];
                gain = max - min;
            } else if (a[i] < min) {
                min = a[i];
            }
        }
        return gain;
    }
}
