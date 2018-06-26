package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LinkedListCycleIITest {

    @Test
    public void detectCycle1() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n1;
        n4.next = n5;
        n5.next = n6;
        n6.next = n1;
        assertEquals(n1, new LinkedListCycleII().detectCycle(n1));
    }

    @Test
    public void detectCycle2() {
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
        assertNull(new LinkedListCycleII().detectCycle(n1));
    }

    @Test
    public void detectCycle3() {
        assertNull(new LinkedListCycleII().detectCycle(null));
    }


    @Test
    public void detectCycle4() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        n2.next = n1;
        assertEquals(n1, new LinkedListCycleII().detectCycle(n1));
    }

    @Test
    public void detectCycle5() {
        ListNode n1 = new ListNode(1);
        assertNull(new LinkedListCycleII().detectCycle(n1));
    }
}