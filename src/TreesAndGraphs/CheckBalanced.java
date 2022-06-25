package TreesAndGraphs;

public class CheckBalanced {
    //Definition of TreeNode:
    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }



    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int leftHeight = traverse(root.left);
        int rightHeight = traverse(root.right);

        if(Math.abs(leftHeight - rightHeight) <= 1) return isBalanced(root.left) && isBalanced(root.right);
        return false;
    }

    private int traverse(TreeNode root) {
        if(root == null) return 0;

        int lHeight = traverse(root.left);
        int rHeight = traverse(root.right);

        return Math.max(lHeight, rHeight)+1;
    }


}




