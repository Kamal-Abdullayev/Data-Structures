package LinkedList.Teory2;

public class DoubleLinkedList<T extends Comparable<T>>{

    Node<T> root;
    Node<T> tail;

    void insert(T data){
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            tail = newNode;
            root = newNode;
        } else {
            newNode.setNextNode(tail);
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }

}
