package problem;

/**
 * 725. Split Linked List in Parts
 * <p>
 * Given a (singly) linked list with head node root, write a function to split the linked list into k consecutive
 * linked list "parts".
 * <p>
 * The length of each part should be as equal as possible: no two parts should have a size differing by more than 1.
 * This may lead to some parts being null.
 * <p>
 * The parts should be in order of occurrence in the input list, and parts occurring earlier should always have
 * a size greater than or equal parts occurring later.
 * <p>
 * Return a List of ListNode's representing the linked list parts that are formed.
 * <p>
 * Examples 1->2->3->4, k = 5 // 5 equal parts [ [1], [2], [3], [4], null ]
 */
public class SplitLinkedListInParts {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int count = 0;
        ListNode curr = root;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        int chunks = count / k;
        int remained = count % k;

        ListNode[] res = new ListNode[k];
        curr = root;
        for (int i = 0; i < k; i++) {
            ListNode node = curr;
            for (int j = 0; j < chunks + (i < remained ? 1 : 0) - 1; j++) {
                if (curr != null) curr = curr.next;
            }

            if (curr != null) {
                ListNode prev = curr;
                curr = curr.next;
                prev.next = null;
            }

            res[i] = node;
        }

        return res;
    }
}
