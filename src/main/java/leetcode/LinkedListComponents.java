package leetcode;

import java.util.HashSet;

/**
 * 817. Linked List Components
 * <p>
 * We are given head, the head node of a linked list containing unique integer values.
 * <p>
 * We are also given the list G, a subset of the values in the linked list.
 * <p>
 * Return the number of connected components in G, where two values are connected
 * if they appear consecutively in the linked list.
 */
public class LinkedListComponents {
    public int numComponents(ListNode head, int[] G) {
        int count = 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : G) {
            set.add(num);
        }

        ListNode curr = head;
        while (curr != null) {
            if (set.contains(curr.val) &&
                    curr.next == null || !set.contains(curr.next.val)) {
                count++;
            }
            curr = curr.next;
        }
        return count;
    }
}
