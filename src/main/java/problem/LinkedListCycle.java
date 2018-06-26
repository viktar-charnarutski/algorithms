package problem;

/**
 * 141. Linked List Cycle
 * <p>
 * Given a linked list, determine if it has a cycle in it.
 * <p>
 * Follow up:
 * Can you solve it without using extra space?
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slowRunner = head;
        ListNode fastRunner = head.next;

        while (fastRunner != null && slowRunner != null) {
            if (slowRunner == fastRunner) return true;

            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next != null ? fastRunner.next.next : null;
        }
        return false;
    }
}
