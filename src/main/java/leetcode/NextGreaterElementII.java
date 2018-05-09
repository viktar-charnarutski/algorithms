package leetcode;

import java.util.Stack;

/**
 * 503. Next Greater Element II
 * <p>
 * Given a circular array (the next element of the last element is the first element of the array),
 * print the Next Greater Number for every element.
 * <p>
 * The Next Greater Number of a number x is the first greater number to its traversing-order next in the array,
 * which means you could search circularly to find its next greater number.
 * <p>
 * If it doesn't exist, output -1 for this number.
 */
public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int j = stack.pop();
                res[j] = nums[i];
            }
            stack.push(i);
        }

        for (int num : nums) {
            while (!stack.isEmpty() && num > nums[stack.peek()]) {
                int j = stack.pop();
                res[j] = num;
            }
        }

        while (!stack.isEmpty()) {
            int j = stack.pop();
            res[j] = -1;
        }

        return res;
    }
}
