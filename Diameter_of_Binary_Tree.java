class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int l=check(root.left);
        int r=check(root.right);
        return l+r;   
    }
    public int check(TreeNode root){
        if(root==null) return 0;
        int l=check(root.left);
        int r=check(root.right);
        return Math.max(l,r)+1;
    }
}