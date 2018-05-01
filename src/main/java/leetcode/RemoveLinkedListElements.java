package leetcode;

/**
 * 203. Remove Linked List Elements
 * <p>
 * Remove all elements from a linked list of integers that have value val.
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
