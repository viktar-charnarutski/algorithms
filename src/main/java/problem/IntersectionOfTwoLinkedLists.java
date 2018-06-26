package problem;

/**
 * 160. Intersection of Two Linked Lists
 * <p>
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * <p>
 * Notes:
 * <p>
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode currA = headA;
        ListNode currB = headB;

        while (currA != null && currB != null) {
            currA = currA.next;
            currB = currB.next;
        }

        if (currA == null) {
            currA = headB;
        } else {
            currB = headA;
        }

        while (currA != null && currB != null) {
            currA = currA.next;
            currB = currB.next;
        }

        if (currA == null) {
            currA = headB;
        } else {
            currB = headA;
        }

        while (currA != currB) {
            if (currA == null || currB == null) return null;

            currA = currA.next;
            currB = currB.next;
        }

        return currA;
    }
}
