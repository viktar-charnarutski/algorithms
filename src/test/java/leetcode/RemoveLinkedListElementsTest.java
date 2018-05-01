package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RemoveLinkedListElementsTest {

    @Test
    public void removeElements_target_in_the_middle() {
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

        ListNode q1 = new ListNode(1);
        ListNode q2 = new ListNode(2);
        ListNode q3 = new ListNode(3);
        ListNode q5 = new ListNode(5);
        ListNode q6 = new ListNode(6);

        q1.next = q2;
        q2.next = q3;
        q3.next = q5;
        q5.next = q6;

        RemoveLinkedListElements ins = new RemoveLinkedListElements();
        assertEquals(q1, ins.removeElements(n1, 4));

    }

    @Test
    public void removeElements_target_in_the_end() {
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

        ListNode q1 = new ListNode(1);
        ListNode q2 = new ListNode(2);
        ListNode q3 = new ListNode(3);
        ListNode q4 = new ListNode(4);
        ListNode q5 = new ListNode(5);

        q1.next = q2;
        q2.next = q3;
        q3.next = q4;
        q4.next = q5;

        RemoveLinkedListElements ins = new RemoveLinkedListElements();
        assertEquals(q1, ins.removeElements(n1, 6));
    }

    @Test
    public void removeElements_target_in_the_beginning() {
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

        ListNode q2 = new ListNode(2);
        ListNode q3 = new ListNode(3);
        ListNode q4 = new ListNode(4);
        ListNode q5 = new ListNode(5);
        ListNode q6 = new ListNode(6);

        q2.next = q3;
        q3.next = q4;
        q4.next = q5;
        q5.next = q6;

        RemoveLinkedListElements ins = new RemoveLinkedListElements();
        assertEquals(q2, ins.removeElements(n1, 1));
    }


    @Test
    public void removeElements_all_elements_are_target() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(1);
        ListNode n6 = new ListNode(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        RemoveLinkedListElements ins = new RemoveLinkedListElements();
        assertNull(ins.removeElements(n1, 1));
    }

    @Test
    public void removeElements_no_target_elements() {
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

        ListNode q1 = new ListNode(1);
        ListNode q2 = new ListNode(2);
        ListNode q3 = new ListNode(3);
        ListNode q4 = new ListNode(4);
        ListNode q5 = new ListNode(5);
        ListNode q6 = new ListNode(6);

        q1.next = q2;
        q2.next = q3;
        q3.next = q4;
        q4.next = q5;
        q5.next = q6;

        RemoveLinkedListElements ins = new RemoveLinkedListElements();
        assertEquals(q1, ins.removeElements(n1, 7));
    }
}