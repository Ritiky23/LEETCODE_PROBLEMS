/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans;
    public int distributeCoins(TreeNode root) {
        ans=0;
        help(root);
        return ans;
    }
    public int help(TreeNode r){
        if(r==null) return 0;
        int l=help(r.left);
        int r1=help(r.right);
        ans+=Math.abs(l)+Math.abs(r1);
        return r.val+l+r1-1;
    }
}
