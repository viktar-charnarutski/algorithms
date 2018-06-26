package problem;

/**
 * 748. Shortest Completing Word
 * <p>
 * Find the minimum length word from a given dictionary words, which has all the letters from
 * the string licensePlate. Such a word is said to complete the given string licensePlate
 * <p>
 * Here, for letters we ignore case. For example, "P" on the licensePlate still matches "p" on the word.
 * <p>
 * It is guaranteed an answer exists. If there are multiple answers, return the one that occurs first in the array.
 * <p>
 * The license plate might have the same letter occurring multiple times.
 * <p>
 * For example, given a licensePlate of "PP", the word "pair" does not complete the licensePlate,
 * but the word "supper" does.
 */
public class ShortestCompletingWord {

    private static int CHARS_COUNT = 26;

    public String shortestCompletingWord(String licensePlate, String[] words) {
        String lower = licensePlate.toLowerCase();
        int[] plate = new int[CHARS_COUNT];
        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (Character.isLetter(c)) {
                plate[c - 'a']++;
            }
        }

        int min = Integer.MAX_VALUE;
        String res = null;
        for (String w : words) {
            if (charMatch(w, plate) && w.length() < min) {
                res = w;
                min = w.length();
            }
        }
        return res;
    }

    private boolean charMatch(String word, int[] target) {
        int[] chars = new int[CHARS_COUNT];
        for (char c : word.toCharArray()) {
            chars[c - 'a']++;
        }

        for (int i = 0; i < CHARS_COUNT; i++) {
            if (chars[i] < target[i]) return false;
        }

        return true;
    }
}
