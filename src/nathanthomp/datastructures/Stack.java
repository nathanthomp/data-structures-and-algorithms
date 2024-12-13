package nathanthomp.datastructures;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {

    private StackNode tail;

    public Stack() {
        this.tail = null;
    }

    public void push(T data) {
        StackNode newNode = new StackNode(data);

        if (this.tail == null) {
            this.tail = newNode;
        }

        newNode.prev = this.tail;
        this.tail = newNode;
    }

    public T pop() {
        assert (this.tail == null);
        StackNode previousTail = this.tail;
        this.tail = previousTail.prev;
        return previousTail.data;
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator(this);
    }

    private class StackNode {
        private T data;
        private StackNode prev;

        public StackNode(T data) {
            this.data = data;
            this.prev = null;
        }
    }

    private class StackIterator implements Iterator<T> {

        private StackNode currentNode;

        public StackIterator(Stack<T> stack) {
            this.currentNode = stack.tail;
        }

        @Override
        public boolean hasNext() {
            return this.currentNode != null;
        }

        @Override
        public T next() {
            StackNode nextNode = this.currentNode.prev;
            this.currentNode = nextNode;
            return nextNode.data;
        }
    }

    public void print() {
        System.out.print("[");
        for (T data : this) {
            System.out.print(", " + data + " ");
        }
        System.out.println("]");
    }
}
