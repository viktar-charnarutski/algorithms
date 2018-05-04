package leetcode;

import java.util.HashMap;

/**
 * 677. Map Sum Pairs
 * <p>
 * Implement a MapSum class with insert, and sum methods.
 * <p>
 * For the method insert, you'll be given a pair of (string, integer).
 * The string represents the key and the integer represents the value.
 * <p>
 * If the key already existed, then the original key-value pair will be overridden to the new one.
 * <p>
 * For the method sum, you'll be given a string representing the prefix,
 * and you need to return the sum of all the pairs' value whose key starts with the prefix.
 */
public class MapSum {

    private HashMap<String, Integer> map;

    public MapSum() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key, val);
    }

    public int sum(String prefix) {
        int sum = 0;

        for (String key : map.keySet()) {
            if (key.indexOf(prefix) == 0) sum += map.get(key);
        }
        return sum;
    }
}
