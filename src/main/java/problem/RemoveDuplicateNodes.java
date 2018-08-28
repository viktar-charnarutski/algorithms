package problem;

import java.util.HashSet;
import java.util.Set;

/**
 * Remove Duplicate Nodes
 * <p>
 * Given a singly-linked list, remove duplicates in the list and return head of the list.
 * Target a worst case space complexity of O(n).
 */
public class RemoveDuplicateNodes {
    public ListNode removeDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        Set<Integer> nodes = new HashSet<>();
        ListNode curr = head, prev = null;
        while (curr != null) {
            if (!nodes.add(curr.val)) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}
