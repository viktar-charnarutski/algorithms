package problem;

/**
 * 203. Remove Linked List Elements
 * <p>
 * Remove all elements from a linked list of integers that have value val.
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode curr = head;
        ListNode prev = fakeHead;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return fakeHead.next;
    }
}
