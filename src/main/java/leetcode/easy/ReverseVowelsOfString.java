package leetcode.easy;

import java.util.*;

/**
 * 345. Reverse Vowels of a String
 * <p>
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * <p>
 * Example 1:
 * Given s = "hello", return "holle".
 * <p>
 * Example 2:
 * Given s = "leetcode", return "leotcede".
 * <p>
 * Note:
 * The vowels does not include the letter "y".
 */
public class ReverseVowelsOfString {

    private static final Set<Character> VOWELS = new HashSet<>();

    static {
        VOWELS.add('a');
        VOWELS.add('o');
        VOWELS.add('e');
        VOWELS.add('i');
        VOWELS.add('u');
        VOWELS.add('A');
        VOWELS.add('O');
        VOWELS.add('E');
        VOWELS.add('I');
        VOWELS.add('U');
    }

    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        for (int i = 0; i < s.length() && left < right; i++) {

            while (left < right && !VOWELS.contains(s.charAt(left))) {
                left++;
            }

            while (left < right && !VOWELS.contains(s.charAt(right))) {
                right--;
            }

            char tmp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = tmp;
        }

        return String.valueOf(chars);
    }

    public String reverseVowelsSlow(String s) {
        char[] chars = s.toCharArray();
        List<Character> wordVowels = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (VOWELS.contains(s.charAt(i))) {
                wordVowels.add(s.charAt(i));
            }
        }

        for (int i = 0, j = wordVowels.size() - 1; i < s.length(); i++) {
            if (VOWELS.contains(s.charAt(i))) {
                chars[i] = wordVowels.get(j--);
            }
        }

        return String.valueOf(chars);
    }
}
