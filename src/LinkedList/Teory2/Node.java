package LinkedList.Teory2;

public class Node<T extends Comparable<T>>{
    T data;
    Node<T> nextNode;
    Node<T> previousNode;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "" + data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node<T> previousNode) {
        this.previousNode = previousNode;
    }
}
