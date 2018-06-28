package problem;

/**
 * Move last element to front of a given Linked List.
 * <p>
 * Write a function that moves last element to front in a given Singly Linked List.
 * <p>
 * For example, if the given Linked List is 1->2->3->4->5, then the function should change the list to 5->1->2->3->4.
 */
public class LastElementToFront {
    public ListNode move(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prev = head, curr = head.next;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;
        curr.next = head;
        return curr;
    }
}
