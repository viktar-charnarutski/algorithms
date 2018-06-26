package problem;

/**
 * 2. Add Two Numbers
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in
 * reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr1 = l1, curr2 = l2;
        ListNode res = dummyHead;
        int carry = 0;
        while (curr1 != null || curr2 != null) {
            int n1 = curr1 != null ? curr1.val : 0;
            int n2 = curr2 != null ? curr2.val : 0;
            int sum = carry + n1 + n2;
            carry = sum / 10;
            res.next = new ListNode(sum % 10);

            res = res.next;
            curr1 = curr1 != null ? curr1.next : null;
            curr2 = curr2 != null ? curr2.next : null;
        }
        if (carry > 0) {
            res.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

}
