package problem;

/**
 * 147. Insertion Sort List
 * <p>
 * Sort a linked list using insertion sort.
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }
            curr.next = prev.next;
            prev.next = curr;
            prev = dummy;
            curr = next;
        }

        return dummy.next;
    }
}
