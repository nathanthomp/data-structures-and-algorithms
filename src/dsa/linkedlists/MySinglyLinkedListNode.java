package dsa.linkedlists;

import dsa.core.MyNode;

public class MySinglyLinkedListNode<T> extends MyNode<T> {
    private MySinglyLinkedListNode<T> next;

    public MySinglyLinkedListNode(T value) {
        super(value);
        this.next = null;
    }

    public MySinglyLinkedListNode<T> getNext() {
        return this.next;
    }

    public void setNext(MySinglyLinkedListNode<T> next) {
        this.next = next;
    }
}
