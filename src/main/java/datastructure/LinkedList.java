package datastructure;

import java.util.NoSuchElementException;

/**
 * Singly linked list.
 */
public class LinkedList<T> {
    private class ListNode {
        T val;
        ListNode next;

        public ListNode(T val) {
            this.val = val;
        }
    }

    private ListNode head;
    private int size;

    public void add(T val) {
        if (head == null) {
            head = new ListNode(val);
        } else {
            ListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new ListNode(val);
        }
        size++;
    }

    public void addToPosition(T val, int pos) {
        if (pos >= size) throw new NoSuchElementException();
        ListNode curr = head, prev = null;
        int count = 0;
        while (count++ != pos) {
            prev = curr;
            curr = curr.next;
        }
        ListNode newNode = new ListNode(val);
        if (prev != null) {
            prev.next = newNode;
        } else {
            head = newNode;
        }
        newNode.next = curr;
        size++;
    }

    public void addToHead(T val) {
        ListNode oldHead = head;
        head = new ListNode(val);
        head.next = oldHead;
        size++;
    }

    public void remove(T val) {
        if (head == null) {
            throw new NoSuchElementException();
        }

        ListNode curr = head, prev = null;
        while (curr != null) {
            if (curr.val.equals(val)) {
                if (prev != null)
                    prev.next = curr.next;
                else
                    head = head.next;
                break;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        size--;
    }

    public void removeFromPosition(int pos) {
        if (pos >= size)
            throw new NoSuchElementException();

        ListNode curr = head, prev = null;
        int index = 0;
        while (index++ != pos) {
            prev = curr;
            curr = curr.next;
        }
        if (prev != null) {
            prev.next = curr.next;
        } else {
            head = head.next;
        }
        size--;
    }

    public void removeFromHead() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        head = head.next;
        size--;
    }

    public boolean contains(T val) {
        if (head != null) {
            ListNode curr = head;
            while (curr != null) {
                if (curr.val.equals(val)) {
                    return true;
                }
                curr = curr.next;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }
}
