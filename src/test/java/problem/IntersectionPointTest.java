package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntersectionPointTest {

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

        ListNode m1 = new ListNode(1);
        ListNode m2 = new ListNode(2);

        m1.next = m2;
        m2.next = n3;

        assertEquals(n3, new IntersectionPoint().intersection(n1, m1));

    }
}