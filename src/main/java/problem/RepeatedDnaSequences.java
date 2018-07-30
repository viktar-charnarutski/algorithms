package problem;

import java.util.*;

/**
 * 187. Repeated DNA Sequences
 * <p>
 * All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG".
 * When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.
 * <p>
 * Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.
 */
public class RepeatedDnaSequences {
    public List<String> findRepeatedDnaSequences(String s) {
        if (s == null || s.isEmpty()) return Collections.emptyList();

        Set<String> res = new HashSet<>();
        for (int i = 0; i < s.length() - 10; i++) {
            String pattern = s.substring(i, i + 10);
            if (!res.contains(pattern)) {
                findRepeatedDnaSequences(s, pattern, res, i + 10);
            }
        }
        return new ArrayList<>(res);
    }

    private void findRepeatedDnaSequences(String s, String pattern, Set<String> res, int start) {
        for (int i = start; i < s.length() - 10; i++) {
            String potential = s.substring(i, i + 10);
            if (potential.equals(pattern)) {
                res.add(pattern);
                break;
            }
        }
    }
}
