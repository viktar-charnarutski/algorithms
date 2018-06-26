package problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 347. Top K Frequent Elements
 *
 * Given a non-empty array of integers, return the k most frequent elements.
 *
 * For example,
 * Given [1,1,1,2,2,3] and k = 2, return [1,2].
 *
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 *
 */
public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for (int num : map.keySet()) {
            int rep = map.get(num);
            if (bucket[rep] == null) {
                bucket[rep] = new ArrayList<>();
            }
            bucket[rep].add(num);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 ; i--) {
            if (bucket[i] != null) {
                for (int n : bucket[i]) {
                    list.add(n);
                    if (list.size() >= k) {
                        return list;
                    }
                }
            }
        }

        return list;
    }
}
