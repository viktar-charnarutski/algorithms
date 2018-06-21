package leetcode;

/**
 * 82. Remove Duplicates from Sorted List II
 * <p>
 * Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 */
public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode prev = fakeHead;

        while (prev != null) {
            ListNode curr = prev.next;
            while (curr != null && curr.next != null
                    && curr.val == curr.next.val) {
                curr = curr.next.next;
            }
            prev.next = curr;
            prev = curr;
        }

        return fakeHead.next;
    }
}
