package TreesAndGraphs;

public class FirstCommonAncestor {

    private TreeNode firstCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return root;

        if(root == p || root == q) return root;

        TreeNode left = firstCommonAncestor(root.left, p, q);

        TreeNode right = firstCommonAncestor(root.right, p, q);

        if(left != null && right != null) return root;
        else if(left == null && right != null) return right;
        else if(left != null && right == null) return left;

        return null;
    }
}
