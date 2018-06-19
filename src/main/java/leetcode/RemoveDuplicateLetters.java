package leetcode;

import java.util.HashMap;
import java.util.Map;

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

        HashMap<Character, Integer> posMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            posMap.put(s.charAt(i), i);
        }

        char[] res = new char[posMap.size()];
        int start = 0, end = minPos(posMap);

        for (int i = 0; i < res.length; i++) {
            char minChar = 'z' + 1;
            for (int j = start; j <= end; j++) {
                if (posMap.containsKey(s.charAt(j)) && s.charAt(j) < minChar) {
                    minChar = s.charAt(j);
                    start = j + 1;

                }
            }
            res[i] = minChar;
            if (i == res.length - 1) break;

            posMap.remove(minChar);
            if (s.charAt(end) == minChar) {
                end = minPos(posMap);
            }
        }

        return new String(res);
    }

    private int minPos(Map<Character, Integer> posMap) {
        int min = Integer.MAX_VALUE;
        for (int i : posMap.values()) {
            min = Math.min(i, min);
        }
        return min;
    }
}
