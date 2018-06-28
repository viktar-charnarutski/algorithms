package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntersectionOfTwoSortedLinkedListsTest {

    @Test
    public void intersection() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        ListNode m1 = new ListNode(2);
        ListNode m2 = new ListNode(4);
        ListNode m3 = new ListNode(6);
        ListNode m4 = new ListNode(8);
        ListNode m5 = new ListNode(10);
        ListNode m6 = new ListNode(12);

        m1.next = m2;
        m2.next = m3;
        m3.next = m4;
        m4.next = m5;
        m5.next = m6;

        ListNode r1 = new ListNode(2);
        ListNode r2 = new ListNode(4);
        ListNode r3 = new ListNode(6);

        r1.next = r2;
        r2.next = r3;

        assertEquals(r1, new IntersectionOfTwoSortedLinkedLists().intersection(n1, m1));
    }
}