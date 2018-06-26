package problem;

/**
 * Length of a Linked List
 * <p>
 * Write a function to count number of nodes in a given singly linked list (Iterative and Recursive).
 */
public class LengthLinkedList {
    public int lengthLinkedListIterative(ListNode head) {
        if (head == null) return 0;
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        return size;
    }
}
