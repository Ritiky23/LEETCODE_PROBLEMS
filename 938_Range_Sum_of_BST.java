class Solution {
    int ans = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        if(root.val <= low){
            if(root.val == low) ans+=root.val;
            rangeSumBST(root.right, low, high);
        }
        else if(root.val >= high){
            if(root.val == high) ans+=root.val;
            rangeSumBST(root.left, low, high);
        }
        else{
            ans+=root.val;
            rangeSumBST(root.left, low, high);
            rangeSumBST(root.right, low, high);
        }
        return ans;
    }
}