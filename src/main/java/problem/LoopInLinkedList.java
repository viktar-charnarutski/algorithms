package problem;

/**
 * Detect loop in a linked list
 * <p>
 * Given a linked list, check if the the linked list has loop or not. Below diagram shows a linked list with a loop.
 */
public class LoopInLinkedList {
    public boolean hasLoop(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;
        while (true) {
            fast = fast.next;
            if (fast == null) break;
            if (fast.equals(slow)) return true;

            fast = fast.next;
            if (fast == null) break;
            if (fast.equals(slow)) return true;

            slow = slow.next;
            if (slow == null) break;
            if (slow.equals(fast)) return true;
        }
        return false;
    }
}
