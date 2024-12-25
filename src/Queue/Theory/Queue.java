package Queue.Theory;

public class Queue<T> {

    Node<T> firstNode;
    Node<T> lastNode;
    private int count;

    public void enqueue(T data) {
        this.count ++;

        Node<T> temp = this.lastNode;
        this.lastNode = new Node<>(data);

        if (isEmpty()) {
            this.firstNode = this.lastNode;
        } else {
            temp.setNextNode(this.lastNode);
        }

    }

    public T dequeue() {

        if (this.lastNode == null) return null;
        this.count--;

        Node<T> temp = this.firstNode;
        this.firstNode = this.firstNode.getNextNode();

        if (isEmpty()) {
            this.lastNode = null;
        }

        return temp.getData();
    }

    public boolean isEmpty() {
        return this.firstNode == null;
    }

    public int size() {
        return this.count;
    }


}
