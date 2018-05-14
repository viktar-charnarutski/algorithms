package leetcode;

/**
 * 445. Add Two Numbers II
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers.
 * The most significant digit comes first and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode curr1 = l1;
        ListNode curr2 = l2;
        int length1 = length(l1);
        int length2 = length(l2);

        curr1 = reverse(curr1);
        curr2 = reverse(curr2);

        ListNode res = length1 > length2 ? curr1 : curr2;
        ListNode currRes = res;

        boolean carry = false;

        while (curr1 != null || curr2 != null) {
            int val1 = curr1 != null ? curr1.val : 0;
            int val2 = curr2 != null ? curr2.val : 0;
            int sum = val1 + val2 + (carry ? 1 : 0);
            carry = sum >= 10;
            currRes.val = sum % 10;

            curr1 = curr1 != null ? curr1.next : curr1;
            curr2 = curr2 != null ? curr2.next : curr2;
            currRes = currRes.next;
        }

        res = reverse(res);

        if (carry) {
            ListNode node = new ListNode(1);
            node.next = res;
            res = node;
        }

        return res;
    }

    private ListNode reverse(ListNode node) {
        ListNode prev = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }

    private int length(ListNode node) {
        int res = 0;
        while (node != null) {
            node = node.next;
            res++;
        }
        return res;
    }
}
