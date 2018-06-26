package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertSortedListToBinarySearchTreeTest {

    @Test
    public void sortedListToBST() {
        ListNode n1 = new ListNode(-10);
        ListNode n2 = new ListNode(-3);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(9);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        TreeNode t1 = new TreeNode(-10);
        TreeNode t2 = new TreeNode(-3);
        TreeNode t3 = new TreeNode(0);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(9);

        t3.left = t2;
        t2.left = t1;
        t3.right = t5;
        t5.right = t4;

        assertEquals(t3, new ConvertSortedListToBinarySearchTree().sortedListToBST(n1));
    }

    @Test
    public void findMiddle() {
        ListNode n1 = new ListNode(-10);
        ListNode n2 = new ListNode(-3);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(9);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        assertEquals(n3, new ConvertSortedListToBinarySearchTree().findMiddleNode(n1));
    }
    @Test
    public void reverseLinkedList() {
        ListNode n1 = new ListNode(-10);
        ListNode n2 = new ListNode(-3);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(9);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode m1 = new ListNode(9);
        ListNode m2 = new ListNode(5);
        ListNode m3 = new ListNode(0);
        ListNode m4 = new ListNode(-3);
        ListNode m5 = new ListNode(-10);
        m1.next = m2;
        m2.next = m3;
        m3.next = m4;
        m4.next = m5;

        assertEquals(m1, new ConvertSortedListToBinarySearchTree().reverseList(n1));
    }
}