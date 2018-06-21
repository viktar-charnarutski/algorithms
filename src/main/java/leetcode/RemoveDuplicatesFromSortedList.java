package leetcode;

/**
 * 83. Remove Duplicates from Sorted List
 * <p>
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            if (next != null && curr.val == next.val) {
                curr.next = next.next;
            } else {
                curr = next;
            }
        }
        return head;
    }
}
