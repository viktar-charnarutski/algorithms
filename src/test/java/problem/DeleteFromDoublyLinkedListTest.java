package problem;

import datastructure.DoublyLinkedNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeleteFromDoublyLinkedListTest {

    @Test
    public void deleteAtPos1() {
        DoublyLinkedNode n1 = new DoublyLinkedNode(1);
        DoublyLinkedNode n2 = new DoublyLinkedNode(2);
        DoublyLinkedNode n3 = new DoublyLinkedNode(3);
        DoublyLinkedNode n4 = new DoublyLinkedNode(4);
        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;


        DoublyLinkedNode e1 = new DoublyLinkedNode(1);
        DoublyLinkedNode e2 = new DoublyLinkedNode(2);
        DoublyLinkedNode e4 = new DoublyLinkedNode(4);
        e1.next = e2;
        e2.prev = e1;
        e2.next = e4;
        e4.prev = e2;

        assertEquals(e1, new DeleteFromDoublyLinkedList().deleteAtPos(n1, 3));
    }
}