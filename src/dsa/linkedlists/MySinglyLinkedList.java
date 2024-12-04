package dsa.linkedlists;

import java.util.Iterator;

import dsa.core.MyNode;

public class MySinglyLinkedList<T> extends MyLinkedList<T> {

    private MySinglyLinkedListNode<T> head;

    public MySinglyLinkedList() {
        this.head = null;
    }

    // ---------------------- MyDataStructure implementations ----------------------

    @Override
    public boolean insert(T element) {
        MySinglyLinkedListNode<T> newNode = new MySinglyLinkedListNode<T>(element);

        if (this.isEmpty()) {
            this.head = newNode;
            return true; // Why always true?
        }

        MySinglyLinkedListNode<T> currentNode = (MySinglyLinkedListNode<T>) this.head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);

        return true;
    }

    // ---------------------- MyLinkedList implementations ----------------------

    @Override
    public MySinglyLinkedListNode<T> getHead() {
        return this.head;
    }

    @Override
    public void setHead(MyNode<T> head) {
        this.head = (MySinglyLinkedListNode<T>) head;
    }

    @Override
    public int getLength() {
        if (this.isEmpty()) {
            return 0;
        }

        int length = 1;
        MySinglyLinkedListNode<T> currentNode = (MySinglyLinkedListNode<T>) this.head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
            length++;
        }
        return length;
    }

    @Override
    public Iterator<T> iterator() {
        return new MySinglyLinkedListIterator((MySinglyLinkedListNode<T>) this.head);
    }

    private class MySinglyLinkedListIterator implements Iterator<T> {
        private MySinglyLinkedListNode<T> currentNode;

        public MySinglyLinkedListIterator(MySinglyLinkedListNode<T> head) {
            this.currentNode = head;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            MySinglyLinkedListNode<T> current = currentNode;
            currentNode = current.getNext();
            return current.getValue();
        }
    }
}
