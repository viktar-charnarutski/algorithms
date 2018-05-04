package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 451. Sort Characters By Frequency
 * <p>
 * Given a string, sort it in decreasing order based on the frequency of characters.
 */
public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        int[] chars = new int[256];

        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)]++;
        }

        HashMap<Integer, List<Character>> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 0) continue;
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], new ArrayList<>());
            }
            map.get(chars[i]).add((char) (i));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = s.length(); i > 0; i--) {
            if (map.containsKey(i)) {
                List<Character> list = map.get(i);
                for (char c : list) {
                    for (int j = 0; j < i; j++) {
                        sb.append(c);
                    }
                }
            }
        }

        return sb.toString();
    }
}
