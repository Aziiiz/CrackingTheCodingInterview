package LinkedLists;

public class LinkedListCycle {

    private static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] array2 = {5,9,2, 9};

        ListNode head = generateList(array2);
        hasCycle(head);


    }

    private static ListNode generateList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next  = new ListNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }
}
