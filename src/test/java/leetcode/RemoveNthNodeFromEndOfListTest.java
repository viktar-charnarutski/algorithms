package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RemoveNthNodeFromEndOfListTest {

    private ListNode n1;
    private ListNode k1;
    private ListNode m1;
    private ListNode l1;
    private ListNode v1;
    private RemoveNthNodeFromEndOfList ins;

    @Before
    public void init() {
        n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        k1 = new ListNode(1);
        ListNode k2 = new ListNode(2);
        ListNode k3 = new ListNode(3);
        ListNode k4 = new ListNode(4);
        ListNode k5 = new ListNode(5);
        k1.next = k2;
        k2.next = k3;
        k3.next = k4;
        k4.next = k5;

        m1 = new ListNode(1);
        ListNode m2 = new ListNode(2);
        ListNode m3 = new ListNode(3);
        ListNode m5 = new ListNode(5);
        m1.next = m2;
        m2.next = m3;
        m3.next = m5;

        l1 = new ListNode(1);

        v1 = new ListNode(1);
        v1.next = new ListNode(2);

        ins = new RemoveNthNodeFromEndOfList();
    }

    @Test
    public void removeNthFromEnd() {
        assertEquals(m1, ins.removeNthFromEnd(n1, 2));
    }

    @Test
    public void removeNthFromEnd_target_is_zero() {
        assertEquals(k1, ins.removeNthFromEnd(n1, 0));
    }

    @Test
    public void removeNthFromEnd_one_node_target_is_one() {
        assertNull(ins.removeNthFromEnd(l1, 1));
    }

    @Test
    public void removeNthFromEnd_removing_head() {
        assertEquals(new ListNode(2), ins.removeNthFromEnd(v1, 2));
    }

    @Test
    public void count() {
        assertEquals(5, ins.countNodes(n1));
    }
}