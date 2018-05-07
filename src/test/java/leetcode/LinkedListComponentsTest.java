package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListComponentsTest {

    @Test
    public void numComponents() {
        ListNode n1 = new ListNode(0);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        LinkedListComponents ins = new LinkedListComponents();
        assertEquals(2, ins.numComponents(n1, new int[]{0, 1, 3}));
    }

    @Test
    public void numComponents1() {
        ListNode n1 = new ListNode(0);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        LinkedListComponents ins = new LinkedListComponents();
        assertEquals(2, ins.numComponents(n1, new int[]{0, 3, 1, 4}));
    }

    @Test
    public void numComponents2() {
        ListNode n1 = new ListNode(0);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        n1.next = n2;
        n2.next = n3;
        LinkedListComponents ins = new LinkedListComponents();
        assertEquals(2, ins.numComponents(n1, new int[]{0, 2}));
    }
}