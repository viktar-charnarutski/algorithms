package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SplitLinkedListInPartsTest {

    @Test
    public void splitListToParts() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        SplitLinkedListInParts ins = new SplitLinkedListInParts();
        ListNode[] expected = new ListNode[5];
        expected[0] = n1;
        expected[0] = n2;
        expected[0] = n3;
        ListNode[] out = ins.splitListToParts(n1, 5);
        assertArrayEquals(expected, out);
    }
}