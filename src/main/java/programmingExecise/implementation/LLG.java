package programmingExecise.implementation;

import programmingExecise.implementation.utils.*;

public class LLG<T> implements LinkedListAnalysis, LinkedListManipulation<T> {

    private Node<T> head;

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public int size() {
        int size = isEmpty() ? 0 : 1;
        Node<T> node = this.head;
        if (!isEmpty()) {
            while (node.getNextNode() != null) {
                size += 1;
                node = node.getNextNode();
            }
        }
        return size;
    }

    @Override
    public void addElement(T element) {
        Node<T> node = new Node(element);
        if (this.head == null) {
            this.head = node;
        } else {
            Node lastNode = this.head;
            while (lastNode.getNextNode() != null) {
                lastNode = lastNode.getNextNode();
            }
            lastNode.setNextNode(node);
        }
    }

    @Override
    public T getElement() {
        Node<T> node = this.head;
        T element = null;
        if (!isEmpty()) {
            element = node.getData();
            this.head = node.getNextNode();
        }
        return element;
    }
}
