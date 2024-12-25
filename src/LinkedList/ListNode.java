package LinkedList;

public class ListNode<T> {
    int val;
    ListNode<T> next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
