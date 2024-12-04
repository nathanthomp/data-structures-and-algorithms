package dsa.linkedlists;

import java.util.Iterator;

import dsa.core.MyNode;

public class MyDoublyLinkedList<T> extends MyLinkedList<T> {

    private MyDoublyLinkedListNode<T> head;

    public MyDoublyLinkedList() {
        this.head = null;
    }

    // ---------------------- MyDataStructure implementations ----------------------

    @Override
    public boolean insert(T element) {
        MyDoublyLinkedListNode<T> newNode = new MyDoublyLinkedListNode<T>(element);

        if (this.head == null) {
            this.head = newNode;
            return true; // Why always returning true?
        }

        MyDoublyLinkedListNode<T> currentNode = (MyDoublyLinkedListNode<T>) this.getHead();
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        newNode.setPrev(currentNode);
        currentNode.setNext(newNode);

        return true;
    }

    // ---------------------- MyLinkedList implementations ----------------------

    @Override
    public MyDoublyLinkedListNode<T> getHead() {
        return this.head;
    }

    @Override
    public void setHead(MyNode<T> head) {
        this.head = (MyDoublyLinkedListNode<T>) head;
    }

    @Override
    public int getLength() {
        if (this.isEmpty()) {
            return 0;
        }

        int length = 1;
        MyDoublyLinkedListNode<T> currentNode = (MyDoublyLinkedListNode<T>) this.head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
            length++;
        }
        return length;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyDoublyLinkedListIterator((MyDoublyLinkedListNode<T>) this.head);
    }

    private class MyDoublyLinkedListIterator implements Iterator<T> {
        private MyDoublyLinkedListNode<T> currentNode;

        public MyDoublyLinkedListIterator(MyDoublyLinkedListNode<T> head) {
            this.currentNode = head;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            MyDoublyLinkedListNode<T> current = currentNode;
            currentNode = current.getNext();
            return current.getValue();
        }
    }
}
