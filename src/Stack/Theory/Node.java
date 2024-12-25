package Stack.Theory;

public class Node<T> {

    T data;
    Node<T> nextNode;

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

    public Node(T data) {
        this.data = data;
    }
}
