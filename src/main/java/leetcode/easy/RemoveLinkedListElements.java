package leetcode.easy;

/**
 * 203. Remove Linked List Elements
 * <p>
 * Remove all elements from a linked list of integers that have value val.
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head != null) removeElements(head.next, head, val);
        return head;
    }

    private static void removeElements(ListNode node, ListNode prev, int val) {
        if (node == null) return;

        if (node.val == val) {
            prev.next = node.next;
            node = prev;
        }

        removeElements(node.next, node, val);
    }
}
