package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SwapNodesInPairsTest {

    @Test
    public void swapPairs() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode o1 = new ListNode(2);
        ListNode o2 = new ListNode(1);
        ListNode o3 = new ListNode(4);
        ListNode o4 = new ListNode(3);
        o1.next = o2;
        o2.next = o3;
        o3.next = o4;

        assertEquals(o1, new SwapNodesInPairs().swapPairs(n1));
    }
}