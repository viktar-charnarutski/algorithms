package leetcode;

/**
 * 109. Convert Sorted List to Binary Search Tree
 * <p>
 * Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
 * <p>
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two
 * subtrees of every node never differ by more than 1.
 */
public class ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        ListNode reversed = reverseList(head);
        ListNode mid = findMiddleNode(head);

        TreeNode treeNodeHead = new TreeNode(mid.val);

        ListNode currListNode = reversed;
        TreeNode currTreeNode = treeNodeHead;
        while (currListNode != mid) {
            currTreeNode.left = new TreeNode(currListNode.val);

            currTreeNode = treeNodeHead.left;
            currListNode = currListNode.next;
        }

        currListNode = currListNode.next;
        currTreeNode = treeNodeHead;
        while (currListNode != null) {
            treeNodeHead.right = new TreeNode(currListNode.val);

            treeNodeHead = treeNodeHead.right;
            currListNode = currListNode.next;
        }
        return currTreeNode;
    }

    ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            next.next = curr;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    ListNode findMiddleNode(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            count++;
        }

        curr = head;
        count /= 2;
        while (count-- > 0) {
            curr = curr.next;
        }
        return curr;
    }
}
