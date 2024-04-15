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
    int g=0;
    public int sumNumbers(TreeNode root) {
        Stack<Pair<TreeNode,Integer>> p = new Stack<>();
        p.push(new Pair<TreeNode,Integer>(root,0));
        while(!p.isEmpty()){
            Pair<TreeNode,Integer> curr = p.pop();
            TreeNode currN=curr.getKey();
            Integer currsum=curr.getValue()*10+currN.val;
            if(currN.left!=null) p.push((new Pair<TreeNode,Integer>(currN.left,currsum)));
            if(currN.right!=null) p.push((new Pair<TreeNode,Integer>(currN.right,currsum)));
            if(currN.left==null && currN.right==null){
            g+=currsum;

        }
        }

        return g;
    }
}
