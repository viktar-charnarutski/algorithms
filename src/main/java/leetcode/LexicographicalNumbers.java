package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 386. Lexicographical Numbers
 *
 * Given an integer n, return 1 - n in lexicographical order.
 *
 * For example, given 13, return: [1,10,11,12,13,2,3,4,5,6,7,8,9].
 *
 * Please optimize your algorithm to use less time and space. The input size may be as large as 5,000,000.
 */
public class LexicographicalNumbers {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<String> strs = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            strs.add(String.valueOf(i));
        }
        Collections.sort(strs);
        ArrayList<Integer> res = new ArrayList<>();
        for (String s : strs) {
            res.add(Integer.parseInt(s));
        }
        return res;
    }
}
