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
        ListNode curr2 = l1;
        int length1 = length(l1);
        int length2 = length(l1);

        ListNode res = length1 > length2 ? l1 : l2;
        ListNode currRes = res;

        curr1 = reverse(curr1);
        curr2 = reverse(curr2);

        boolean carry = false;

        while (curr1 != null && curr2 != null) {
            int sum = curr1.val + curr2.val + (carry ? 1 : 0);
            if (sum == 10) {
                currRes.val = 0;
                carry = true;
            } else {
                currRes.val = sum;
            }

            curr1 = curr1.next;
            curr2 = curr2.next;
            currRes = currRes.next;
        }

        return reverse(res);
    }

    ListNode reverse(ListNode node) {
        ListNode head = node;
        while (node != null) {
            ListNode next = node.next;
            node.next = head;
            head = node;
            node = next;
        }

        return head;
    }

    private int length(ListNode node) {
        int res = 0;
        ListNode curr = node;
        while (curr != null) {
            curr = curr.next;
            res++;
        }
        return res;
    }
}
