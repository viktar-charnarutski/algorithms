package problem;

/**
 * 242. Valid Anagram
 * <p>
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * <p>
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * <p>
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * <p>
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] letters = new int[128];
        for (char c : s.toCharArray()) {
            letters[c - 'a'] = letters[c - 'a'] + 1;
        }

        for (char c : t.toCharArray()) {
            if (letters[c - 'a']-- < 1) return false;
        }

        return true;
    }
}
