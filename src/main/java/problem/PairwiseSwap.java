package problem;

/**
 * Pairwise swap.
 *
 * Given a singly linked list, write a function to swap elements pairwise.
 *
 * For example, if the linked list is 1->2->3->4->5 then the function should change it to 2->1->4->3->5,
 * and if the linked list is 1->2->3->4->5->6 then the function should change it to 2->1->4->3->6->5.
 */
public class PairwiseSwap {
    public ListNode swap(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;

        ListNode prev = fakeHead, curr = head;
        while (curr != null && curr.next != null) {
            ListNode next = curr.next;
            ListNode nextnext = curr.next.next;

            prev.next = next;
            next.next = curr;
            curr.next = nextnext;

            prev = curr;
            curr = nextnext;
        }
        return fakeHead.next;
    }
}
