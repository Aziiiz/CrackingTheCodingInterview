package LinkedLists;

public class PartitionList {

    private static ListNode partitionList(ListNode head, int x) {
        ListNode tempLow = new ListNode(0);
        ListNode low = tempLow;
        ListNode tempHigh = new ListNode(0);
        ListNode high = tempHigh;

        while (head != null) {
            if(x > head.val) {
                tempLow.next = new ListNode(head.val);
                tempLow = tempLow.next;
            }else {
                tempHigh.next = new ListNode(head.val);
                tempHigh = tempHigh.next;
            }
            head = head.next;
        }
        tempLow.next = high.next;
        return low.next;
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
    public static void main(String[] args) {
        int[] array = {3,5,8,5,10,2,1};
        ListNode head = generateList(array);
        ListNode node = partitionList(head, 5);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }    }
}
