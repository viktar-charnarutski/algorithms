package leetcode;

/**
 * 424. Longest Repeating Character Replacement
 * <p>
 * Given a string that consists of only uppercase English letters,
 * you can replace any letter in the string with another letter at most k times.
 * <p>
 * Find the length of a longest substring containing all repeating letters y
 * ou can get after performing the above operations.
 * <p>
 * Note:
 * Both the string's length and k will not exceed 10^4.
 * <p>
 * ABAB 2
 */
public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        int max = 0;
        int[] chars = new int[26];
        for (int start = 0, end = 0, count = 0; end < s.length(); end++) {
            count = Math.max(++chars[s.charAt(end) - 'A'], count);
            while (end - start + 1 - count > k) {
                chars[s.charAt(start) - 'A']--;
                start++;
            }
            max = Math.max(end - start + 1, max);
        }
        return max;
    }
}
