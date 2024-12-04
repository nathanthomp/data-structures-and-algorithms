package dsa.linkedlists;

import dsa.core.MyDataStructure;
import dsa.core.MyNode;

public abstract class MyLinkedList<T> implements MyDataStructure<T>, Iterable<T> {

    public abstract MyNode<T> getHead();

    public abstract void setHead(MyNode<T> head);

    public abstract int getLength();

    // ---------------------- MyDataStructure implementations ----------------------

    @Override
    public boolean isEmpty() {
        return this.getHead() == null;
    }
}
