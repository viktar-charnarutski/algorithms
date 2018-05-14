package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class AddTwoNumbersIITest {

    @Test
    public void addTwoNumbers() {
        ListNode n1 = new ListNode(7);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode m1 = new ListNode(5);
        ListNode m2 = new ListNode(6);
        ListNode m3 = new ListNode(4);
        m1.next = m2;
        m2.next = m3;

        ListNode nm1 = new ListNode(7);
        ListNode nm2 = new ListNode(8);
        ListNode nm3 = new ListNode(0);
        ListNode nm4 = new ListNode(7);
        nm1.next = nm2;
        nm2.next = nm3;
        nm3.next = nm4;

        assertEquals(nm1, new AddTwoNumbersII().addTwoNumbers(n1, m1));
    }

    @Test
    public void reverseList() {
        AddTwoNumbersII ins = new AddTwoNumbersII();

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        assertSame(n5, ins.reverse(n1));
    }
}