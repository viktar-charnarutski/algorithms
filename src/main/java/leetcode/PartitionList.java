package leetcode;

/**
 * 86. Partition List
 * <p>
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater
 * than or equal to x.
 * <p>
 * You should preserve the original relative order of the nodes in each of the two partitions.
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyHead1 = new ListNode(0);
        ListNode dummyHead2 = new ListNode(0);
        dummyHead1.next = head;
        dummyHead2.next = head;

        ListNode curr1 = dummyHead1;
        ListNode curr2 = dummyHead2;

        while (head != null) {
            if (head.val < x) {
                curr1.next = head;
                curr1 = head;
            } else {
                curr2.next = head;
                curr2 = head;
            }
            head = head.next;
        }

        curr2.next = null;
        curr1.next = dummyHead2.next;
        return dummyHead1.next;
    }
}
