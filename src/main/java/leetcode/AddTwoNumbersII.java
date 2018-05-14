package leetcode;

import java.util.Stack;

/**
 * 445. Add Two Numbers II
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers.
 * The most significant digit comes first and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Follow up:
 * What if you cannot modify the input lists? In other words, reversing the lists is not allowed.
 */
public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = listValuesToStack(l1);
        Stack<Integer> stack2 = listValuesToStack(l2);

        boolean carry = false;

        ListNode curr = null;
        ListNode prev;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            prev = curr;

            int n1 = stack1.isEmpty() ? 0 : stack1.pop();
            int n2 = stack2.isEmpty() ? 0 : stack2.pop();
            int sum = n1 + n2 + (carry ? 1 : 0);
            carry = sum >= 10;

            curr = new ListNode(sum % 10);
            curr.next = prev;
        }

        if (carry) {
            ListNode node = new ListNode(1);
            node.next = curr;
            curr = node;
        }

        return curr;
    }

    private Stack<Integer> listValuesToStack(ListNode n) {
        Stack<Integer> stack = new Stack<>();
        ListNode curr = n;
        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }
        return stack;
    }
}
