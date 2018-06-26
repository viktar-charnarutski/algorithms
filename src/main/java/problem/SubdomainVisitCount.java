package problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 811. Subdomain Visit Count
 * <p>
 * A website domain like "discuss.leetcode.com" consists of various subdomains.
 * At the top level, we have "com", at the next level, we have "leetcode.com", and at the lowest level,
 * "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com", we will also visit the parent
 * domains "leetcode.com" and "com" implicitly.
 * <p>
 * Now, call a "count-paired domain" to be a count (representing the number of visits this domain received),
 * followed by a space, followed by the address. An example of a count-paired domain might be "9001 discuss.leetcode.com".
 * <p>
 * We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains,
 * (in the same format as the input, and in any order), that explicitly counts the number of visits to each subdomain.
 */
public class SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<>();
        HashMap<String, Integer> visits = new HashMap<>();

        for (String str : cpdomains) {
            String[] line = str.split(" ");
            int count = Integer.valueOf(line[0]);
            String[] domains = line[1].split("\\.");
            String temp = "";
            for (int i = domains.length - 1; i >= 0; i--) {
                temp = domains[i] + (temp.equals("") ? temp : "." + temp);
                if (!visits.containsKey(temp)) {
                    visits.put(temp, count);
                } else {
                    visits.put(temp, visits.get(temp) + count);
                }
            }
        }

        for (String str : visits.keySet()) {
            res.add(visits.get(str) + " " + str);
        }
        return res;
    }
}
