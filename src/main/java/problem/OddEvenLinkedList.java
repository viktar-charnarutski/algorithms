package problem;

/**
 * 328. Odd Even Linked List
 * <p>
 * Given a singly linked list, group all odd nodes together followed by the even nodes.
 * Please note here we are talking about the node number and not the value in the nodes.
 * <p>
 * You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 */
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode dummyHead1 = new ListNode(0);
        ListNode dummyHead2 = new ListNode(0);
        ListNode odd = dummyHead1;
        ListNode even = dummyHead2;

        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            if (++count % 2 == 0) {
                even.next = curr;
                even = curr;
            } else {
                odd.next = curr;
                odd = curr;
            }
            curr = curr.next;
        }
        odd.next = dummyHead2.next;
        even.next = null;
        return dummyHead1.next;
    }
}
