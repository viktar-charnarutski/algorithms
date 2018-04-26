package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class IntersectionOfTwoLinkedListsTest {

    @Test
    public void getIntersectionNode_have_intersection() {
        ListNode n1 = new ListNode(11);
        ListNode n2 = new ListNode(12);
        ListNode n3 = new ListNode(13);
        ListNode n4 = new ListNode(14);

        ListNode m1 = new ListNode(21);
        ListNode m2 = new ListNode(22);
        ListNode m3 = new ListNode(23);

        ListNode k1 = new ListNode(8);
        ListNode k2 = new ListNode(9);
        ListNode k3 = new ListNode(10);
        ListNode k4 = new ListNode(11);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = k1;

        m1.next = m2;
        m2.next = m3;
        m3.next = k1;

        k1.next = k2;
        k2.next = k3;
        k3.next = k4;

        IntersectionOfTwoLinkedLists ins = new IntersectionOfTwoLinkedLists();
        assertSame(k1, ins.getIntersectionNode(n1, m1));
    }
    @Test
    public void getIntersectionNode_no_intersection() {
        ListNode n1 = new ListNode(11);
        ListNode n2 = new ListNode(12);
        ListNode n3 = new ListNode(13);
        ListNode n4 = new ListNode(14);

        ListNode m1 = new ListNode(21);
        ListNode m2 = new ListNode(22);
        ListNode m3 = new ListNode(23);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        m1.next = m2;
        m2.next = m3;

        IntersectionOfTwoLinkedLists ins = new IntersectionOfTwoLinkedLists();
        assertNull(ins.getIntersectionNode(n1, m1));
    }
}