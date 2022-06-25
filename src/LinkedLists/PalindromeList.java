package LinkedLists;


public class PalindromeList {

    private static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode temp;
        ListNode curr = slow;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        while (prev != null) {
            if(prev.val != head.val) return false;
            prev = prev.next;
            head = head.next;
        }
        return true;

    }


    public static void main(String[] args) {
        int[] array = {1,2,3,2,1};

        ListNode head = generateList(array);

        System.out.println(isPalindrome(head));
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
