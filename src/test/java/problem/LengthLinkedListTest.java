package problem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthLinkedListTest {

    private ListNode head;
    private LengthLinkedList ins;

    @Before
    public void setup() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        this.head = n1;
        this.ins = new LengthLinkedList();
    }

    @Test
    public void lengthLinkedListIterative_length_of_0_iterative() {
        assertEquals(0, this.ins.lengthLinkedListIterative(null));
    }

    @Test
    public void lengthLinkedListIterative_length_of_1_iterative() {
        assertEquals(1, this.ins.lengthLinkedListIterative(new ListNode(0)));
    }

    @Test
    public void lengthLinkedListIterative_length_of_5_iterative() {
        assertEquals(5, this.ins.lengthLinkedListIterative(this.head));
    }
}