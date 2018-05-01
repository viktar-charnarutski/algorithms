package leetcode;

import java.util.Stack;

/**
 * 234. Palindrome Linked List
 * <p>
 * Given a singly linked list, determine if it is a palindrome.
 * <p>
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        fast = head;
        slow = reverse(slow);

        while (slow != null) {
            if (slow.val != fast.val) {
                return false;
            }

            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public boolean isPalindromeOrig(ListNode head) {
        if (head == null || head.next == null) return true;

        Stack<ListNode> nodes = new Stack<>();

        int count = 0;
        ListNode current = head;
        while (current != null) {
            nodes.push(current);
            current = current.next;
            count++;
        }

        int i = 0;
        ListNode right = head;
        while (i < (count / 2)) {
            ListNode left = nodes.pop();
            if (left.val != right.val) return false;

            right = right.next;
            i++;
        }

        return true;
    }
}
