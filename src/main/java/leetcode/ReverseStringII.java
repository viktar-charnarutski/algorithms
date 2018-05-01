package leetcode;

/**
 * 541. Reverse String II
 * <p>
 * Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from
 * the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k
 * but greater than or equal to k characters, then reverse the first k characters and left the other as original.
 * Example:
 * Input: s = "abcdefg", k = 2
 * Output: "bacdfeg"
 * Restrictions:
 * The string consists of lower English letters only.
 * Length of the given string and k will in the range [1, 10000]
 */
public class ReverseStringII {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i += 2 * k) {
            swap(chars, i, i + k);
        }
        return String.valueOf(chars);
    }

    private void swap(char[] a, int l, int r) {
        r = Math.min(r, a.length) - 1;
        while (l < r) {
            char tmp = a[l];
            a[l++] = a[r];
            a[r--] = tmp;
        }
    }
}