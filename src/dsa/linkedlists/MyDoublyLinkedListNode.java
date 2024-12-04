package dsa.linkedlists;

import dsa.core.MyNode;

public class MyDoublyLinkedListNode<T> extends MyNode<T> {
    private MyDoublyLinkedListNode<T> prev;
    private MyDoublyLinkedListNode<T> next;

    public MyDoublyLinkedListNode() {
        super();
        this.prev = null;
        this.next = null;
    }

    public MyDoublyLinkedListNode(T value) {
        super(value);
        this.prev = null;
        this.next = null;
    }

    public MyDoublyLinkedListNode<T> getPrev() {
        return prev;
    }

    public void setPrev(MyDoublyLinkedListNode<T> prev) {
        this.prev = prev;
    }

    public MyDoublyLinkedListNode<T> getNext() {
        return next;
    }

    public void setNext(MyDoublyLinkedListNode<T> next) {
        this.next = next;
    }
}
