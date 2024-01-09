class Solution {
    public void helper(TreeNode root , List<Integer>end_node){
        if(root == null)return;

        if(root.left ==  null && root .right == null){
            end_node.add(root.val);
        }
        helper(root.left,end_node);
        helper(root.right,end_node);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> end_node1 = new ArrayList<>();
        List<Integer> end_node2 = new ArrayList<>();

        helper(root1,end_node1);
        helper(root2,end_node2);

        return end_node1.equals(end_node2);
        
    }
}