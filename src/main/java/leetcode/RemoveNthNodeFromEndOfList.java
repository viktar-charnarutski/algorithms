package leetcode;

/**
 * 19. Remove Nth Node From End of List
 * <p>
 * Given a linked list, remove the n-th node from the end of list and return its head.
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;

        ListNode first = fakeHead;
        ListNode second = fakeHead;

        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return fakeHead.next;
    }
}
