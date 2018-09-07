package problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * String Permutation
 * <p>
 * String permutations are the various possible strings made by the rearrangement of the characters in the original
 * String.
 * <p>
 * For example, the permutations of car are
 * <p>
 * car, cra, acr, arc, rac, rca
 * <p>
 * Write a recursive method getPermutations() that returns all permutations of an input String in an ArrayList.
 * Define a helper method if needed. For the sake of simplicity, assume that all characters in the input String are
 * unique.
 */
public class StringPermutation {
    public List<String> getPermutations(String s) {
        if (s == null) {
            return null;
        }
        if (s.length() == 0) {
            return Collections.emptyList();
        }
        List<String> res = new ArrayList<>();
        getPermutations("", s, res);
        return res;
    }

    private void getPermutations(String curr, String s, List<String> res) {
        if (curr.length() == s.length()) {
            res.add(curr);
            return;
        }
        for (char c : s.toCharArray()) {
            if (curr.indexOf(c) != -1) {
                continue;
            }
            getPermutations(curr + c, s, res);
        }
    }
}
