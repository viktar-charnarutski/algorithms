package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicateNodesTest {

    @Test
    public void removeDuplicates1() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n11 = new ListNode(1);
        ListNode n12 = new ListNode(2);
        ListNode n13 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n44 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n11;
        n11.next = n12;
        n12.next = n13;
        n13.next = n4;
        n4.next = n44;

        ListNode m1 = new ListNode(1);
        ListNode m2 = new ListNode(2);
        ListNode m3 = new ListNode(3);
        ListNode m4 = new ListNode(4);
        m1.next = m2;
        m2.next = m3;
        m3.next = m4;

        assertEquals(m1, new RemoveDuplicateNodes().removeDuplicates(n1));
    }
}