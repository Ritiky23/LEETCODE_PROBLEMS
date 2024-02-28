class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int ans=0;
        while(!q.isEmpty()){
                int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode n=q.poll();
                if(i==0){
                    ans=n.val;
                }
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
            }
        }
        return ans;  
    }
}