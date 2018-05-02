package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 763. Partition Labels
 * <p>
 * A string S of lowercase letters is given. We want to partition this string into as many parts as possible
 * so that each letter appears in at most one part, and return a list of integers representing the size of these parts.
 */
public class PartitionLabels {

    public List<Integer> partitionLabels(String S) {
        ArrayList<Integer> result = new ArrayList<>();

        int[] occurrences = new int[26];
        for (int i = 0; i < S.length(); i++) {
            occurrences[S.charAt(i) - 'a'] = i;
        }

        int start = 0;
        int end = 0;
        for (int i = 0; i < S.length(); i++) {
            end = Math.max(occurrences[S.charAt(i) - 'a'], end);
            if (end == i) {
                result.add(end - start + 1);
                start = end + 1;
            }
        }

        return result;
    }
}
