package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

/**
 *
 */
public class ReverseLinkedListTest {

    @Test
    public void reverseList() {
        ReverseLinkedList ins = new ReverseLinkedList();

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        assertSame(n5, ins.reverseList(n1));

        assertNull(ins.reverseList(null));

        ListNode n6 = new ListNode(6);
        assertSame(6, ins.reverseList(n6).val);

        ListNode n7 = new ListNode(7);
        ListNode n8 = new ListNode(8);
        n7.next = n8;

        assertSame(n8, ins.reverseList(n7));
    }
}