package problem;

/**
 * Intersection Point.
 * <p>
 * There are two singly linked lists in a system. By some programming error the end node of one of the linked list
 * got linked into the second list, forming a inverted Y shaped list.
 * <p>
 * Write a program to get the point where two linked list merge.
 */
public class IntersectionPoint {
    public ListNode intersection(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) return null;

        ListNode curr1 = head1;
        ListNode curr2 = head2;
        int count1 = 0;
        int count2 = 0;
        while (curr1 != null) {
            curr1 = curr1.next;
            count1++;
        }
        while (curr2 != null) {
            curr2 = curr2.next;
            count2++;
        }

        int count = Math.abs(count1 - count2);

        ListNode curr = count1 > count2 ? head1 : head2;
        while (count-- > 0) {
            curr = curr.next;
        }

        curr1 = count1 > count2 ? curr : head1;
        curr2 = count1 < count2 ? curr : head2;

        while (curr1 != null && curr2 != null && curr1 != curr2) {
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        return curr1;
    }
}
