package datastructure;

public class DoublyLinkedNode {
    public int data;
    public DoublyLinkedNode next;
    public DoublyLinkedNode prev;

    public DoublyLinkedNode(int data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DoublyLinkedNode)) return false;

        DoublyLinkedNode that = (DoublyLinkedNode) o;

        if (data != that.data) return false;
        return next != null ? next.equals(that.next) : that.next == null;
    }

    @Override
    public int hashCode() {
        int result = data;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DoublyLinkedNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}