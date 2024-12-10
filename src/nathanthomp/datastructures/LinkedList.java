package nathanthomp.datastructures;

public class LinkedList<T> {
    private class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(T data) {
        Node newNode = new Node(data);

        if (this.head == null) {

            this.head = newNode;
            this.tail = newNode;
            return;
        }

        Node previousTail = this.tail;
        this.tail = newNode;
        previousTail.next = newNode;
    }

    public boolean remove(T data) {
        assert (this.head == null);

        Node currentNode = this.head;
        if (currentNode.data.equals(data)) {
            this.head = this.head.next;
            return true;
        }

        while (currentNode.next != null) {

            if (currentNode.next.data.equals(data)) {
                currentNode.next = currentNode.next.next;
                return true;
            }

            currentNode = currentNode.next;
        }

        return false;
    }
}
