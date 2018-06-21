package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Remove Duplicates from Unsorted List
 * <p>
 * Write code to remove duplicates from an unsorted linked list.
 *
 * 1 2 1 3 1 4
 * 1 2 3 4
 */
public class RemoveDuplicatesFromUnsortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        Set<Integer> uniqueNodes = new HashSet<>();
        uniqueNodes.add(head.val);

        ListNode prev = head;
        while (prev != null) {
            ListNode curr = prev.next;
            if (curr != null && !uniqueNodes.add(curr.val)) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
        }
        return head;
    }
}
