package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 141. Linked List Cycle
 * <p>
 * Given a linked list, determine if it has a cycle in it.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        Set<ListNode> nodes = new HashSet<>();
        ListNode curr = head;
        while (curr != null) {
            if (!nodes.add(curr)) return true;
            curr = curr.next;
        }
        return false;
    }
}
