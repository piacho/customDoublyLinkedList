package programmingExecise.implementation.utils;

public class Node<T> {

    private T data;
    private Node<T> nextNode;

    public Node(T data) {
        this.data = data;

    }

    // possibly to be removed if changed private data to public
    // could use this static class here

    //TODO think about removing set Data as it is not needed with current implementation.
    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }

    public Node<T> getNextNode(){
        return nextNode;
    }


}
