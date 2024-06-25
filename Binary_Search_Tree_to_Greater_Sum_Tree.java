class Solution {
    public TreeNode bstToGst(TreeNode root) {
        helper(root, 0);
        return root;
    }
    private int helper(TreeNode root, int sum){
        if(root == null){
            return sum;
        }
        int right = helper(root.right, sum);
        root.val += right;
        int left = helper(root.left, root.val);
        return left;
    }
}
