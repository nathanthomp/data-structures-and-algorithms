package dsa.core;

public class MyNode<T> {
    private T value;

    public MyNode() {
    }

    public MyNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
