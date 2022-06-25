package TreesAndGraphs;

public class MinimalTree {

        public TreeNode minimalTree(int[] nums) {
            int midl = nums.length/2;
            int left = midl-1;
            int right = midl+1;
            TreeNode root = new TreeNode(nums[midl]);
            root.left = fill(0, left, nums);
            root.right = fill(right, nums.length-1, nums);
            return root;
        }

        private TreeNode fill(int low , int high, int[] nums) {
            if(low > high) return null;
            int mid = (low+high)/2;

            TreeNode node = new TreeNode(nums[mid]);

            node.left = fill(low, mid-1, nums);
            node.right = fill(mid+1, high, nums);

            return node;
        }

    public class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
}
