package problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 373. Find K Pairs with Smallest Sums
 * <p>
 * You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k.
 * <p>
 * Define a pair (u,v) which consists of one element from the first array and one element from the second array.
 * <p>
 * Find the k pairs (u1,v1),(u2,v2) ...(uk,vk) with the smallest sums.
 */
public class FindKPairsWithSmallestSums {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0 || k <= 0) {
            return Collections.emptyList();
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> ((a[0] + a[1]) - (b[0] + b[1])));
        for (int i = 0; i < nums1.length && i < k; i++) {
            queue.offer(new int[]{nums1[i], nums2[0], 0});
        }
        List<int[]> res = new ArrayList<>();
        while (k-- > 0 && !queue.isEmpty()) {
            int[] curr = queue.remove();
            res.add(new int[]{curr[0], curr[1]});
            if (curr[2] < nums2.length - 1) {
                queue.offer(new int[]{curr[0], nums2[curr[2] + 1], curr[2] + 1});
            }
        }
        return res;
    }

    public List<int[]> kSmallestPairs1(int[] nums1, int[] nums2, int k) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0 || k <= 0) {
            return Collections.emptyList();
        }
        List<int[]> res = new ArrayList<>();
        int i1 = 0, i2 = 0;
        while (i1 != nums1.length && i2 != nums2.length) {
            res.add(new int[]{nums1[i1], nums2[i2]});
            if (res.size() == k) {
                return res;
            }
            if (i1 + 1 == nums1.length) {
                i2++;
            } else if (i2 + 1 == nums2.length) {
                i1++;
            } else if (nums1[i1] + nums2[i2 + 1] < nums1[i1 + 1] + nums2[i2]) {
                i2++;
            } else {
                i1++;
            }
        }
        return res;
    }
}
