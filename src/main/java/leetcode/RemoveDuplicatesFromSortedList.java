package leetcode;

/**
 * 83. Remove Duplicates from Sorted List
 * <p>
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = head;

        while (prev != null) {
            ListNode next = prev.next;
            while (next != null && prev.val != next.val) {
                prev.next = next.next;
            }

            prev = next;
        }
        return head;
    }
}
