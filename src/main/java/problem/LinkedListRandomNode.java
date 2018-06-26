package problem;

import java.util.Random;

/**
 * 382. Linked List Random Node
 * <p>
 * Given a singly linked list, return a random node's value from the linked list.
 * Each node must have the same probability of being chosen.
 */
public class LinkedListRandomNode {

    private Random rand;
    private ListNode node;

    /**
     * @param head The linked list's head.
     *             Note that the head is guaranteed to be not null, so it contains at least one node.
     */
    public LinkedListRandomNode(ListNode head) {
        rand = new Random();
        node = head;
    }

    /**
     * Returns a random node's value.
     */
    public int getRandom() {
        int res = node.val;
        ListNode curr = node;

        for (int i = 1; curr != null; i++) {
            if (rand.nextInt(i) == 0) {
                res = curr.val;
            }
            curr = curr.next;
        }
        return res;
    }
}
