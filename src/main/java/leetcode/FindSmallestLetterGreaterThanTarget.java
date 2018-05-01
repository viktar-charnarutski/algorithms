package leetcode;

/**
 * 744. Find Smallest Letter Greater Than Target
 * <p>
 * Given a list of sorted characters letters containing only lowercase letters,
 * and given a target letter target, find the smallest element in the list that is larger than the given target.
 * <p>
 * Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.
 */
public class FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        for (char c : letters) {
            if (c > target) return c;
        }
        return letters[0];
    }

    public char nextGreatestLetterSlow(char[] letters, char target) {
        boolean[] occurrences = new boolean[26];

        for (char c : letters) {
            occurrences[c - 'a'] = true;
        }

        for (int i = (target - 'a') + 1; i < occurrences.length; i++) {
            if (occurrences[i]) return (char) (i + 'a');
        }

        for (int i = 0; i < target - 'a'; i++) {
            if (occurrences[i]) return (char) (i + 'a');
        }

        return target;
    }
}
