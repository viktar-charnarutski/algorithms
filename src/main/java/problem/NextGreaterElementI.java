package problem;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 496. Next Greater Element I
 * <p>
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2.
 * Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 * <p>
 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2.
 * If it does not exist, output -1 for this number.
 */
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> greaterPairs = new HashMap<>();
        Stack<Integer> nextGreater = new Stack<>();

        for (int num : nums2) {

            while (!nextGreater.empty() && nextGreater.peek() < num) {
                Integer pop = nextGreater.pop();
                greaterPairs.put(pop, num);
            }

            nextGreater.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = greaterPairs.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }
}
