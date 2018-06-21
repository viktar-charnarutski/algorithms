package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RemoveDuplicatesFromUnsortedListTest {

    @Test
    public void deleteDuplicates() {
        RemoveDuplicatesFromUnsortedList ins = new RemoveDuplicatesFromUnsortedList();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(3);
        n1.next = n3;
        n3.next = n2;
        n2.next = n4;
        n4.next = n5;

        ListNode n21 = new ListNode(1);
        ListNode n22 = new ListNode(2);
        ListNode n23 = new ListNode(3);
        n21.next = n22;
        n22.next = n23;

        assertEquals(n21, ins.deleteDuplicates(n1));
    }

    @Test
    public void deleteDuplicates_no_duplicates() {
        RemoveDuplicatesFromUnsortedList ins = new RemoveDuplicatesFromUnsortedList();
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
        ListNode n23 = new ListNode(3);
        ListNode n24 = new ListNode(4);
        ListNode n25 = new ListNode(5);
        n21.next = n22;
        n22.next = n23;
        n23.next = n24;
        n24.next = n25;

        assertEquals(n21, ins.deleteDuplicates(n1));
    }

    @Test
    public void deleteDuplicates_one_node() {
        RemoveDuplicatesFromUnsortedList ins = new RemoveDuplicatesFromUnsortedList();
        assertEquals(new ListNode(1), ins.deleteDuplicates(new ListNode(1)));
    }

    @Test
    public void deleteDuplicates_null() {
        RemoveDuplicatesFromUnsortedList ins = new RemoveDuplicatesFromUnsortedList();
        assertNull(ins.deleteDuplicates(null));
    }
}