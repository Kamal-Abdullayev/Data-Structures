package Stack.Theory;

public class Stack<T> {
    private Node<T> head;
    private int count;

    public void push(T data) {
        count++;
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> temp = head;
            head = new Node<>(data);
            head.setNextNode(temp);
        }

    }
    public T pop() {
        T item = head.getData();
        head = head.getNextNode();
        count--;
        return item;
    }

    public void peak() {
        System.out.println(head.data);
        head = head.getNextNode();

    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}
