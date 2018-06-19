package leetcode;

/**
 * 316. Remove Duplicate Letters
 * <p>
 * Given a string which contains only lowercase letters, remove duplicate letters so that every letter
 * appear once and only once.
 * <p>
 * You must make sure your result is the smallest in lexicographical order among all possible results.
 * <p>
 * bcabc - abc
 */
public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        if (s == null || s.isEmpty()) return s;

        int[] charsAmount = new int[26];
        for (char c : s.toCharArray()) {
            charsAmount[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charsAmount.length; i++) {
            if (charsAmount[i] != 0) {
                sb.append(Character.toChars(i + 'a'));
                charsAmount[i] = 0;
            }
        }

        return sb.toString();
    }
}
