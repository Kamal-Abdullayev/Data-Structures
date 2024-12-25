package LinkedList;

public class ConvertBinaryNumberLinkedListToInteger {

    // 1290. Convert Binary Number in a Linked List to Integer
    public static int getDecimalValue(ListNode head) {
        String value = "";
        while(head != null) {
            value += head.val;
            head = head.next;
        }
        int decimalNumber=Integer.parseInt(value,2);

        return decimalNumber;
    }
}
