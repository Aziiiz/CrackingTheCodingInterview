package LinkedLists;

//public class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {
//    }
//    ListNode(int val) {
//        this.val = val;
//    }
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}

public class KthToLast {

    public static int printKthToLast(ListNode head, int k) {
        if (head == null) {
            return 0;
        }
        int index = printKthToLast(head.next, k) + 1;
        if (index == k) {
            System.out.println(k + "th to last node is " + head.val);
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        ListNode head = new ListNode(array[0]);
        for (int i = 1; i < array.length; i++) {
            head.next  = new ListNode(array[i]);
        }
        for (int i = 0; i <= array.length+1; i++) {
            printKthToLast(head, i);
        }
    }
}
