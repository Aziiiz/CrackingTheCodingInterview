package LinkedLists;

public class Intersection {


    private static ListNode intersection(ListNode headA, ListNode headB) {
        int sizeA = 0;
        int sizeB = 0;
        ListNode temp = headA;
        while(temp != null) {
            sizeA++;
            temp = temp.next;
        }

        temp = headB;
        while(temp != null) {
            sizeB++;
            temp = temp.next;
        }

        if(sizeA > sizeB) {
            int diff = sizeA - sizeB;
            while(diff > 0) {
                diff--;
                headA = headA.next;
            }
        }else {
            int diff = sizeB - sizeA;
            while(diff > 0) {
                diff--;
                headB = headB.next;
            }
        }

        while(headA !=null && headB != null) {
            if(headA == headB) return headB;
            headB = headB.next;
            headA = headA.next;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array = {4,1,8,4,5};
        int[] array2 = {5,6,1,8,4,5};

        ListNode head1 = generateList(array);
        ListNode head2 = generateList(array2);

        intersection(head1, head2);
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
