package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTwoNumbersTest {

    /*
    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    Explanation: 342 + 465 = 807.
     */
    @Test
    public void addTwoNumbers() {
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(2);
        n1.next = n2;
        n2.next = n3;
        ListNode m1 = new ListNode(5);
        ListNode m2 = new ListNode(6);
        ListNode m3 = new ListNode(4);
        m1.next = m2;
        m2.next = m3;
        ListNode r1 = new ListNode(7);
        ListNode r2 = new ListNode(0);
        ListNode r3 = new ListNode(8);
        r1.next = r2;
        r2.next = r3;
        assertEquals(r1, new AddTwoNumbers().addTwoNumbers(n1, m1));
    }
}