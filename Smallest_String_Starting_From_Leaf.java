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
    public void helper(TreeNode root, StringBuilder sb, ArrayList<String> ans){
        if(root==null) return;
        sb.append((char)(root.val+97));
        if(root.left==null && root.right==null){
            ans.add(new StringBuilder(sb).reverse().toString());
        }
        helper(root.left, new StringBuilder(sb), ans);
        helper(root.right, new StringBuilder(sb), ans);
    }
    public String smallestFromLeaf(TreeNode root) {
        ArrayList<String> ans=new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(root, sb, ans);
        Collections.sort(ans);
        String s=ans.get(0);
    return s;
    }
}
