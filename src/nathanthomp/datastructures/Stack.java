package nathanthomp.datastructures;

public class Stack<T> {

    private class Node {
        private T data;
        private Node prev;

        public Node(T data) {
            this.data = data;
            this.prev = null;
        }
    }

    private Node tail; // a.k.a. top

    public Stack() {
        this.tail = null;
    }

    public void push(T data) {
        if (this.tail == null) {
            this.tail = new Node(data);
        }

        Node newNode = new Node(data);
        newNode.prev = this.tail;

        this.tail = newNode;
    }

    public T pop() {
        assert (this.tail == null);
        Node previousTail = this.tail;
        this.tail = previousTail.prev;
        return previousTail.data;
    }

    public void print() {
        if (this.tail == null) {
            System.out.println("[]");
            return;
        }

        System.out.print("[ " + this.tail.data + ", ");

        Node currentNode = this.tail;
        while (currentNode.prev != null) {
            currentNode = currentNode.prev;
            System.out.print(currentNode.data);
            if (currentNode.prev == null) {
                System.out.print(" ");
            } else {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
