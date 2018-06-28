package problem;

/**
 * Intersection of two Sorted Linked Lists.
 * <p>
 * Given two lists sorted in increasing order, create and return a new list representing the intersection
 * of the two lists. The new list should be made with its own memory — the original lists should not be changed.
 * <p>
 * For example, let the first linked list be 1->2->3->4->6 and second linked list be 2->4->6->8,
 * then your function should create and return a third list as 2->4->6.
 */
public class IntersectionOfTwoSortedLinkedLists {
    public ListNode intersection(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode res = new ListNode(0);
        ListNode currA = headA, currB = headB, currRes = res;

        while (currA != null && currB != null) {
            while (currA != null && currA.val < currB.val) {
                currA = currA.next;
            }
            while (currA != null && currB != null && currB.val < currA.val) {
                currB = currB.next;
            }

            if (currA != null && currB != null) {
                currRes.next = new ListNode(currA.val);
                currRes = currRes.next;
                currA = currA.next;
                currB = currB.next;
            }
        }

        return res.next;
    }
}
