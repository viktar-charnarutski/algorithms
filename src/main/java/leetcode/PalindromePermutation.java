package leetcode;

/**
 * 266. Palindrome Permutation
 * <p>
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards. A permutation
 * is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
 */
public class PalindromePermutation {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return false;
        int[] charsCount = new int[26];
        int count = 0;
        for (char c : s.toCharArray()) {
            if (!Character.isLetter(c)) continue;
            charsCount[c - 'a']++;
            count = charsCount[c - 'a'] % 2 == 0 ? --count : ++count;
        }
        return count <= 1;
    }
}
