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
        if (next != null ? !next.equals(that.next) : that.next != null) return false;
        return prev != null ? prev.equals(that.prev) : that.prev == null;
    }

    @Override
    public int hashCode() {
        int result = data;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        result = 31 * result + (prev != null ? prev.hashCode() : 0);
        return result;
    }
}