package leetcode;

/**
 * 19. Remove Nth Node From End of List
 * <p>
 * Given a linked list, remove the n-th node from the end of list and return its head.
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n < 0) return head;

        int nodeNumToRemove = countNodes(head) - n;

        int currCount = 0;
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode prev = fakeHead;
        while (prev != null) {
            ListNode curr = prev.next;
            if (curr != null && currCount++ == nodeNumToRemove) {
                prev.next = curr.next;
                break;
            }
            prev = curr;
        }

        return fakeHead.next;
    }

    int countNodes(ListNode head) {
        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        return count;
    }
}
