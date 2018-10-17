package problem;

import java.util.Arrays;

/**
 * Bigger is Greater
 * <p>
 * Lexicographical order is often known as alphabetical order when dealing with strings. A string is greater than
 * another string if it comes later in a lexicographically sorted list.
 * <p>
 * Given a word, create a new word by swapping some or all of its characters. This new word must meet two criteria:
 * <p>
 * 1. It must be greater than the original word
 * 2. It must be the smallest word that meets the first condition
 */
public class BiggerIsGreater {
    // abcd --> abdc
    static String biggerIsGreater(String w) {
        char[] chars = w.toCharArray();

        // 1. find pivot
        int start = chars.length - 1;
        while (start > 0 && chars[start - 1] >= chars[start]) {
            start--;
        }

        // it's already the last permutation
        if (start <= 0) {
            return "no answer";
        }
        int pivot = start - 1;

        // 2. find a min element in respect to the pivot
        int min = chars.length - 1;
        while (chars[min] <= chars[pivot]) {
            min--;
        }

        // 3. swap min and pivot
        swap(chars, pivot, min);

        // 4. reverse the suffix part of the array
        int lo = pivot + 1, hi = chars.length - 1;
        while (lo < hi) {
            swap(chars, lo++, hi--);
        }

        return String.valueOf(chars);
    }

    private static void swap(char[] chars, int lo, int hi) {
        char tmp1 = chars[lo];
        chars[lo] = chars[hi];
        chars[hi] = tmp1;
    }
}
