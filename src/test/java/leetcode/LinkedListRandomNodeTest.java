package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class LinkedListRandomNodeTest {

    @Test
    public void getRandom() {
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

        LinkedListRandomNode ins = new LinkedListRandomNode(n1);
        int r1 = ins.getRandom();
        assertNotEquals(r1, ins.getRandom());
    }
}