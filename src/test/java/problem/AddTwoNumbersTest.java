package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTwoNumbersTest {

    /*
    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    Explanation: 342 + 465 = 807.
     */
    @Test
    public void addTwoNumbers0() {
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);
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

    @Test
    public void addTwoNumbers2() {
        ListNode n1 = new ListNode(9);
        ListNode n2 = new ListNode(9);
        ListNode n3 = new ListNode(9);
        ListNode n4 = new ListNode(9);
        ListNode n5 = new ListNode(9);
        ListNode n6 = new ListNode(9);
        ListNode n7 = new ListNode(9);
        ListNode n8 = new ListNode(9);
        ListNode n9 = new ListNode(9);
        ListNode n10 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;

        ListNode m1 = new ListNode(1);

        ListNode r1 = new ListNode(0);
        ListNode r2 = new ListNode(0);
        ListNode r3 = new ListNode(0);
        ListNode r4 = new ListNode(0);
        ListNode r5 = new ListNode(0);
        ListNode r6 = new ListNode(0);
        ListNode r7 = new ListNode(0);
        ListNode r8 = new ListNode(0);
        ListNode r9 = new ListNode(0);
        ListNode r10 = new ListNode(2);
        r1.next = r2;
        r2.next = r3;
        r3.next = r4;
        r4.next = r5;
        r5.next = r6;
        r6.next = r7;
        r7.next = r8;
        r8.next = r9;
        r9.next = r10;
        assertEquals(r1, new AddTwoNumbers().addTwoNumbers(n1, m1));
    }

    /*
    Input: (1 -> 8) + (0)
    Output: 1 -> 8
    Explanation: 81 + 0 = 81.
     */
    @Test
    public void addTwoNumbers1() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(8);
        n1.next = n2;

        ListNode m1 = new ListNode(0);

        ListNode r1 = new ListNode(1);
        ListNode r2 = new ListNode(8);
        r1.next = r2;
        assertEquals(r1, new AddTwoNumbers().addTwoNumbers(n1, m1));
    }
}