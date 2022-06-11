package LinkedLists;

public class DeleteMiddleNode {

    private static void deleteMiddleNode(ListNode head) {
        int counter = 0;
        ListNode temp = head;
        while(temp != null) {
            counter++;
            temp = temp.next;
        }
        int tempCounter = 0;
        temp = head;
        while (tempCounter != (counter/2)-2) {
            tempCounter++;
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6,7,8};
        ListNode head = new ListNode(array[0]);
        ListNode temp = head;
        for (int i = 1; i < array.length; i++) {
            temp.next  = new ListNode(array[i]);
            temp = temp.next;
        }
        deleteMiddleNode(head);
        while (head != null) {
           System.out.println(head.val);
           head = head.next;
        }
    }
}
