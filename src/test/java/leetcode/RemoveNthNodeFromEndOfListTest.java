package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveNthNodeFromEndOfListTest {

    @Test
    public void removeNthFromEnd() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode n21 = new ListNode(1);
        ListNode n22 = new ListNode(2);
        ListNode n24 = new ListNode(4);
        ListNode n25 = new ListNode(5);
        n21.next = n22;
        n22.next = n24;
        n24.next = n25;

        assertEquals(n21, new RemoveNthNodeFromEndOfList().removeNthFromEnd(n1, 2));
    }
}