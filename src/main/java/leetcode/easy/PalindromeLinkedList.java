package leetcode.easy;

import java.util.Stack;

/**
 * 234. Palindrome Linked List
 *
 * Given a singly linked list, determine if it is a palindrome.
 *
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
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
