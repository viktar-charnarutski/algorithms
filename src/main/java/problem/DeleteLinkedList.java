package problem;

/**
 * Delete a Linked List
 * <p>
 * Write a function to delete a Linked List.
 */
public class DeleteLinkedList {
    public void deleteLinkedList(ListNode head) {
        while (head != null) {
            ListNode next = head.next;
            head.next = null;
            head = next;
        }
    }
}
