package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LinkedListCycleTest {

    @Test
    public void hasCycle_true() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n1;

        LinkedListCycle ins = new LinkedListCycle();
        assertTrue(ins.hasCycle(n1));
    }

    @Test
    public void hasCycle_false() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        LinkedListCycle ins = new LinkedListCycle();
        assertFalse(ins.hasCycle(n1));
    }
}