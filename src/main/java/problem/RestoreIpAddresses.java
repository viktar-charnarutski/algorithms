package problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 93. Restore IP Addresses
 * <p>
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.
 */
public class RestoreIpAddresses {
    public List<String> restoreIpAddresses(String s) {
        if (s == null) {
            return Collections.emptyList();
        }
        ArrayList<String> res = new ArrayList<>();
        generate(s, "", 0, 0, res);
        return res;
    }

    private void generate(String s, String curr, int ind, int lvl, ArrayList<String> res) {
        if (lvl > 4) return;
        if (lvl == 4 && ind == s.length()) {
            res.add(curr);
        }
        for (int i = 1; i < 4; i++) {
            if (i + ind > s.length()) {
                break;
            }
            String part = s.substring(ind, ind + i);
            if (part.startsWith("0") && part.length() > 1 || i == 3 && Integer.valueOf(part) >= 256) {
                continue;
            }
            generate(s, curr + (lvl == 4 || lvl == 0 ? "" : ".") + part, ind + i, lvl + 1, res);
        }
    }
}
