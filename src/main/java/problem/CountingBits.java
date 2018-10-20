package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * 338. Counting Bits
 * <p>
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's
 * in their binary representation and return them as an array.
 * <p>
 * Example 1:
 * <p>
 * Input: 2
 * Output: [0,1,1]
 * Example 2:
 * <p>
 * Input: 5
 * Output: [0,1,1,2,1,2]
 */
public class CountingBits {
    public int[] countBits(int num) {
        List<Integer> bits = new ArrayList<>();
        for (int i = 0; i <= num; i++) {
            bits.add(countOnes(i));
        }
        int[] res = new int[bits.size()];
        for (int i = 0; i < bits.size(); i++) {
            res[i] = bits.get(i);
        }
        return res;
    }

    private int countOnes(int n) {
        if (n <= 1) return n;
        return countOnes(n / 2) + (n % 2);
    }
}
