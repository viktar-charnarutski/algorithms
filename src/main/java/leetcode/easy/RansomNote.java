package leetcode.easy;

/**
 * 383. Ransom Note
 * <p>
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 * <p>
 * Each letter in the magazine string can only be used once in your ransom note.
 * <p>
 * Note:
 * You may assume that both strings contain only lowercase letters.
 * <p>
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chars = new int[128];
        boolean result = true;

        for (char c : magazine.toCharArray()) {
            chars[c]++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (chars[c] <= 0) {
                result = false;
                break;
            }
            chars[c]--;
        }
        return result;
    }
}
