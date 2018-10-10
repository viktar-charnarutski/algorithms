package problem;

import java.util.*;

/**
 * Pseudo-Isomorphic Substrings
 * <p>
 * Two strings A and B, consisting of small English alphabet letters are called pseudo-isomorphic if
 * <p>
 * Their lengths are equal
 * For every pair (i,j), where 1 <= i < j <= |A|, B[i] = B[j], iff A[i] = A[j]
 * For every pair (i,j), where 1 <= i < j <= |A|, B[i] != B[j] iff A[i] != A[j]
 * <p>
 * Naturally, we use 1-indexation in these definitions and |A| denotes the length of the string A.
 * <p>
 * You are given a string S, consisting of no more than 105 lowercase alphabetical characters. For every prefix of S
 * denoted by S', you are expected to find the size of the largest possible set of strings , such that all elements of
 * the set are substrings of S' and no two strings inside the set are pseudo-isomorphic to each other.
 * <p>
 * if S = abcde
 * then, 1st prefix of S is 'a'
 * then, 2nd prefix of S is 'ab'
 * then, 3rd prefix of S is 'abc'
 * then, 4th prefix of S is 'abcd' and so on.
 * <p>
 * Constraints
 * <p>
 * S contains only lower-case english alphabets ('a' - 'z').
 * Output Format
 * <p>
 * Output N lines. On the ith line, output the size of the largest possible set for the first i alphabetical characters
 * of S such that no two strings in the set are pseudo-isomorphic to each other.
 * <p>
 * abc ->
 * a
 * ab
 * b
 * abc
 * bc
 * c
 */
public class PseudoIsomorphicSubstrings {

    static int[] pseudoIsomorphicSubstrings(String s) {
        Set<String> uniqPatterns = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        StringBuilder curr = new StringBuilder();
        Map<String, String> hashes = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            curr.append(s.charAt(i));
            isomorphicSubstringsCount(curr.toString(), uniqPatterns, hashes);
            result.add(uniqPatterns.size());
        }
        return listToArray(result);
    }

    private static void isomorphicSubstringsCount(String s, Set<String> uniqPatterns,
                                                  Map<String, String> hashes) {
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {

                sb.append(s.charAt(j));

                if (hashes.containsKey(sb.toString())) {
                    continue;
                }
                String hash = hash(sb.toString());
                hashes.put(sb.toString(), hash);

                uniqPatterns.add(hash);
            }
        }
    }

    private static int[] listToArray(List<Integer> list) {
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    static String hash(String s) {
        Map<Character, StringBuilder> hashes = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashes.containsKey(c)) {
                StringBuilder hash = hashes.get(c);
                hash.append(":").append(i);
            } else {
                hashes.put(c, new StringBuilder().append(i));
            }
        }
        // composing a final hash
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(hashes.get(c)).append("-");
        }
        return sb.toString();
    }
}
