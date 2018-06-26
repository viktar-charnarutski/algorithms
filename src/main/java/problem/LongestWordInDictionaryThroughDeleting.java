package problem;

import java.util.List;

/**
 * 524. Longest Word in Dictionary through Deleting
 * <p>
 * Given a string and a string dictionary, find the longest string in the dictionary that can be formed
 * by deleting some characters of the given string. If there are more than one possible results,
 * return the longest word with the smallest lexicographical order. If there is no possible result,
 * return the empty string.
 */
public class LongestWordInDictionaryThroughDeleting {

    public String findLongestWord(String s, List<String> d) {
        d.sort((a, b) -> a.length() != b.length() ? -Integer.compare(a.length(), b.length()) : a.compareTo(b));
        for (String str : d) {
            int i = 0;
            for (char c : s.toCharArray()) {
                if (i < str.length() && c == str.charAt(i)) {
                    i++;
                }
            }
            if (i == str.length()) return str;
        }
        return "";
    }
}
