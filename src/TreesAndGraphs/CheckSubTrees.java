package TreesAndGraphs;

import java.util.LinkedList;
import java.util.Queue;

public class CheckSubTrees {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);

        // bfs
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {
                TreeNode node = queue.poll();

                if(node.val == subRoot.val && checkTree(node, subRoot)) {
                    return true;
                }

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }
        return false;
    }

    private boolean checkTree(TreeNode root, TreeNode sub) {
        if(root == null && sub == null) return true;

        if((root!= null && sub != null) && root.val == sub.val) {
            return checkTree(root.left, sub.left) && checkTree(root.right, sub.right);
        }

        return false;
    }
}
