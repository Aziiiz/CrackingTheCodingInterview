package TreesAndGraphs;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListOfDepths {

        /**
         * @param root the root of binary tree
         * @return a lists of linked list
         */
        public List<ListNode> listOfDepths(TreeNode root) {

            List<ListNode> list = new ArrayList<>();
            if(root == null) return list;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()) {
                int n = queue.size();
                ListNode listNode = new ListNode(0);
                ListNode temp = listNode;
                for(int i=0; i<n; i++) {
                    TreeNode node = queue.poll();

                    temp.next = new ListNode(node.val);
                    temp = temp.next;

                    if(node.left != null) queue.add(node.left);
                    if(node.right != null) queue.add(node.right);
                }
                list.add(listNode.next);
            }
            return list;
        }


    //Definition of TreeNode:
    public class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
