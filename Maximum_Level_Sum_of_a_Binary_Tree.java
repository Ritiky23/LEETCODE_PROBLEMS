class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int l=0;
        int max=Integer.MIN_VALUE;
        int c=0;
        while(!q.isEmpty()){
            int size=q.size();
            c++;
            int ans=0;
            for(int i=0;i<size;i++){
                TreeNode p=q.poll();
                ans+=p.val;
                if(p.left!=null) q.add(p.left);
                if(p.right!=null) q.add(p.right);
            }
            if(ans>max){
                l=c;
                max=ans;
            }
        
    }
    return l;
}}
