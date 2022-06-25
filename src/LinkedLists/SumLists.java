package LinkedLists;

public class SumLists {

    private static int sumList(ListNode l1, ListNode l2) {
        String s1 = "";
        String s2 = "";
        while (l1 != null) {
            s1 = String.valueOf(l1.val) + s1;
            l1 = l1.next;
        }
        while (l2 != null) {
            s2 = String.valueOf(l2.val) + s2;
            l2 = l2.next;
        }
        if(s1.equals("") && s2.equals("")) return 0;
        else if(s1.equals("")) return Integer.parseInt(s2);
        else if(s2.equals("")) return Integer.parseInt(s1);

        System.out.println(s1 + " " + s2);
        return Integer.parseInt(s1) + Integer.parseInt(s2);

    }

    public static void main(String[] args) {
        int[] array = {7,1,6};
        int[] array2 = {5,9,2};

        ListNode head1 = generateList(array);
        ListNode head2 = generateList(array2);

        System.out.println(sumList(head1, head2));

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
