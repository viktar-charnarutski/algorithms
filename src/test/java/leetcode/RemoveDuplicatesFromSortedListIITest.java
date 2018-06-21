package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesFromSortedListIITest {
    @Test
    public void deleteDuplicates0() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n22 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n22;
        n22.next = n3;

        ListNode m1 = new ListNode(1);
        ListNode m3 = new ListNode(3);
        m1.next = m3;
        assertEquals(m1, new RemoveDuplicatesFromSortedListII().deleteDuplicates(n1));
    }

    @Test
    public void deleteDuplicates1() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n33 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n44 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n33;
        n33.next = n4;
        n4.next = n44;
        n44.next = n5;

        ListNode m1 = new ListNode(1);
        ListNode m2 = new ListNode(2);
        ListNode m5 = new ListNode(5);
        m1.next = m2;
        m2.next = m5;

        assertEquals(m1, new RemoveDuplicatesFromSortedListII().deleteDuplicates(n1));
    }

    @Test
    public void deleteDuplicates2() {
        ListNode n1 = new ListNode(1);
        ListNode n11 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n33 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n44 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n11;
        n11.next = n2;
        n2.next = n3;
        n3.next = n33;
        n33.next = n4;
        n4.next = n44;
        n44.next = n5;

        ListNode m2 = new ListNode(2);
        ListNode m5 = new ListNode(5);
        m2.next = m5;

        assertEquals(m2, new RemoveDuplicatesFromSortedListII().deleteDuplicates(n1));
    }
}