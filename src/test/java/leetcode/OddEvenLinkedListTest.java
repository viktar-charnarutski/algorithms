package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddEvenLinkedListTest {

    @Test
    public void oddEvenList() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode m1 = new ListNode(1);
        ListNode m2 = new ListNode(3);
        ListNode m3 = new ListNode(2);
        ListNode m4 = new ListNode(5);
        ListNode m5 = new ListNode(4);
        m1.next = m2;
        m2.next = m3;
        m3.next = m4;
        m4.next = m5;

        assertEquals(m1, new OddEvenLinkedList().oddEvenList(m1));
    }
}