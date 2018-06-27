package problem;

/**
 * Find the middle of a given linked list
 * <p>
 * Given a singly linked list, find middle of the linked list.
 * For example, if given linked list is 1->2->3->4->5 then output should be 3.
 * <p>
 * If there are even nodes, then there would be two middle nodes, we need to print second middle element.
 * For example, if given linked list is 1->2->3->4->5->6 then output should be 4.
 */
public class MiddleOfLinkedList {
    public ListNode middlePointers(ListNode head) {
        if (head == null) return head;
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode middleCount(ListNode head) {
        if (head == null) return head;

        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        int mid = count / 2;

        curr = head;
        while (mid-- > 0) {
            curr = curr.next;
        }
        return curr;
    }
}
