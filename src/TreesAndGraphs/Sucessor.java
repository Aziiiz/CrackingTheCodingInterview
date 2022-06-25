package TreesAndGraphs;

public class Sucessor {
    TreeNode prev = null;

    private TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        inorder(root, p);
        return prev;
    }
    private void inorder(TreeNode root, TreeNode p) {
        if(root == null) return;

        inorder(root.left, p);
        if(root.val > p.val && prev == null) {
            prev = root;
            return;
        }
        inorder(root.right, p);
    }
}
