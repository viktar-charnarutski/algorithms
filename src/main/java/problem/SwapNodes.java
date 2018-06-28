package problem;

/**
 * Swap nodes.
 * <p>
 * Given a linked list and two keys in it, swap nodes for two given keys. Nodes should be swapped by changing links.
 * Swapping data of nodes may be expensive in many situations when data contains many fields.
 */
public class SwapNodes {
    public ListNode swap(ListNode head, int a, int b) {
        if (head == null || head.next == null || a == b) return head;

        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;

        ListNode prev = fakeHead;
        ListNode curr = head;

        ListNode prevA = null, nodeA = null;
        ListNode prevB = null, nodeB = null;

        while (curr != null) {
            if (curr.val == a) {
                prevA = prev;
                nodeA = curr;
            } else if (curr.val == b) {
                prevB = prev;
                nodeB = curr;
            } else if (nodeA != null && nodeB != null){
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        prevA.next = nodeB;
        prevB.next = nodeA;

        ListNode tmp = nodeA.next;
        nodeA.next = nodeB.next;
        nodeB.next = tmp;

        return fakeHead.next;
    }
}
