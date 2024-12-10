package nathanthomp.datastructures;

public class Queue<T> {

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

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(T data) {
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

    public T dequeue() {
        assert (this.head == null);

        Node previousHead = this.head;
        this.head = previousHead.next;
        return previousHead.data;
    }

    public void print() {
        if (this.head == null) {
            System.out.println("[]");
            return;
        }

        System.out.print("[ " + this.head.data + ", ");

        Node currentNode = this.head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.print(currentNode.data);
            if (currentNode.next == null) {
                System.out.print(" ");
            } else {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
