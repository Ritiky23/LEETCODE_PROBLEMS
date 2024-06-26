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
    List<TreeNode> a=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return help(0,a.size()-1);
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        a.add(root);
        inorder(root.right);
    }
    public TreeNode help(int low,int high){
        int mid=(low+high)/2;
        if (low>high) return null;
        TreeNode p= (a.get(mid));
        p.left=help(low,mid-1);
        p.right=help(mid+1,high);
        return p;
    }

}
