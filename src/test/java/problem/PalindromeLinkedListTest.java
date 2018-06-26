package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeLinkedListTest {

    @Test
    public void isPalindrome_true() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n31 = new ListNode(3);
        ListNode n21 = new ListNode(2);
        ListNode n11 = new ListNode(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n31;
        n31.next = n21;
        n21.next = n11;

        PalindromeLinkedList ins = new PalindromeLinkedList();
        assertTrue(ins.isPalindrome(n1));
    }

    @Test
    public void isPalindrome_false() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n31 = new ListNode(5);
        ListNode n21 = new ListNode(2);
        ListNode n11 = new ListNode(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n31;
        n31.next = n21;
        n21.next = n11;

        PalindromeLinkedList ins = new PalindromeLinkedList();
        assertFalse(ins.isPalindrome(n1));
    }

    @Test
    public void isPalindrome_head_is_null() {
        PalindromeLinkedList ins = new PalindromeLinkedList();
        assertTrue(ins.isPalindrome(null));
    }

    @Test
    public void isPalindrome_one_node() {
        PalindromeLinkedList ins = new PalindromeLinkedList();
        assertTrue(ins.isPalindrome(new ListNode(1)));
    }

    @Test
    public void isPalindrome_two_different_nodes() {
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(2);

        PalindromeLinkedList ins = new PalindromeLinkedList();
        assertFalse(ins.isPalindrome(n1));
    }

    @Test
    public void isPalindrome_two_equal_nodes() {
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(1);

        PalindromeLinkedList ins = new PalindromeLinkedList();
        assertTrue(ins.isPalindrome(n1));
    }
}