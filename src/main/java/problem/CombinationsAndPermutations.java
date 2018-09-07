package problem;

import java.util.ArrayList;

/**
 * Combinations and Permutations
 * <p>
 * Given a string, list all possible combinations and permutations of its characters.
 * <p>
 * Examples:
 * getCombPerms("a") ==> {"a"}
 * <p>
 * getCombPerms("ab") ==> {"a","ab","ba","b"}
 */
public class CombinationsAndPermutations {
    public static ArrayList<String> getCombPerms(String s) {
        ArrayList<String> res = new ArrayList<>();
        perm("", res, s);
        return res;
    }

    private static void perm(String curr, ArrayList<String> res, String s) {
        if (curr.length() <= s.length() && !res.contains(curr)) {
            if (curr.length() != 0) res.add(curr);
        } else {
            return;
        }
        for (char c : s.toCharArray()) {
            if (curr.indexOf(c) != -1) {
                continue;
            }
            perm(curr + c , res, s);
        }
    }
}
