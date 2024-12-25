package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

    // 234. Palindrome Linked List
    public boolean isPalindrome(ListNode head) {
        List<Integer> listNode = new ArrayList<>();

        while(head != null) {
            listNode.add(head.val);
            head = head.next;
        }

        for(int i = 0; i < listNode.size()/2; i++) {
            if(listNode.get(i) != listNode.get(listNode.size()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
