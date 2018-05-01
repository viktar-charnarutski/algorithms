package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class DeleteNodeInALinkedListTest {

    @Test
    public void deleteNode() {
        DeleteNodeInALinkedList ins = new DeleteNodeInALinkedList();

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ins.deleteNode(n3);

        assertSame(4, n2.next.val);

    }
}