package problem;

import java.util.*;

/**
 * 890. Find and Replace Pattern
 * <p>
 * You have a list of words and a pattern, and you want to know which words in words matches the pattern.
 * <p>
 * A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the
 * pattern with p(x), we get the desired word.
 * <p>
 * (Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter,
 * and no two letters map to the same letter.)
 * <p>
 * Return a list of the words in words that match the given pattern.
 * <p>
 * You may return the answer in any order.
 */
public class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int[] patternMask = mask(pattern);
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (Arrays.equals(mask(word), patternMask)) {
                res.add(word);
            }
        }
        return res;
    }

    private static int[] mask(String word) {
        int[] mask = new int[word.length()];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            map.putIfAbsent(c, i);
            mask[i] = map.get(c);
        }
        return mask;
    }

    public List<String> findAndReplacePattern1(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (isPattern(word, pattern)) {
                res.add(word);
            }
        }
        return res;
    }

    private boolean isPattern(String word, String pattern) {
        Map<Character, Character> mapWord = new HashMap<>();
        Map<Character, Character> mapPattern = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            if (!mapWord.containsKey(w)) {
                mapWord.put(w, p);
            }
            if (!mapPattern.containsKey(p)) {
                mapPattern.put(p, w);
            }
            if (mapWord.get(w) != p || mapPattern.get(p) != w) {
                return false;
            }
        }
        return true;
    }
}
