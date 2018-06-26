package problem;

import org.junit.Test;

import static org.junit.Assert.assertNull;

public class DeleteLinkedListTest {

    @Test
    public void deleteLinkedList() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        new DeleteLinkedList().deleteLinkedList(n1);
        assertNull(n1.next);
        assertNull(n2.next);
        assertNull(n3.next);
    }
}