package problem;

import datastructure.DoublyLinkedNode;

/**
 * Delete the Node at the Specific Position in a Doubly Linked List
 * <p>
 * Given a doubly-linked list, write a method to delete the node at a given position
 * (starting from 1 as the head position) and return the modified list's head.
 * Do nothing if the input position is out of range.
 */
public class DeleteFromDoublyLinkedList {
    public DoublyLinkedNode deleteAtPos(DoublyLinkedNode head, int pos) {
        if (head == null) {
            return null;
        }
        if (pos == 1) {
            head.prev = null;
            return head.next;
        }
        DoublyLinkedNode curr = head, prev = null;
        while (--pos > 0 && curr != null) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
            if (curr.next != null) {
                curr.next.prev = prev;
            }
        }
        return head;
    }
}
