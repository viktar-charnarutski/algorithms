package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 599. Minimum Index Sum of Two Lists
 * <p>
 * Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite
 * restaurants represented by strings.
 * <p>
 * You need to help them find out their common interest with the least list index sum. If there is a choice tie between
 * answers, output all of them with no order requirement. You could assume there always exists an answer.
 */
public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = Integer.MAX_VALUE;
        ArrayList<String> result = new ArrayList<>();

        HashMap<String, Integer> list1Map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            list1Map.put(list1[i], i);
        }

        for (int i = 0; i < list2.length; i++) {
            if (list1Map.containsKey(list2[i])) {
                int inxSum = list1Map.get(list2[i]) + i;
                if (inxSum == min) {
                    result.add(list2[i]);
                } else if (inxSum < min) {
                    min = inxSum;
                    if (!result.isEmpty()) result.clear();
                    result.add(list2[i]);
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
