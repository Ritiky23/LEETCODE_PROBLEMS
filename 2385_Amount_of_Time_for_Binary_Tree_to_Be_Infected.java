class Solution {
    Map<Integer,List<Integer>>adj=new HashMap<>();
    public int amountOfTime(TreeNode root, int start) {
        graph(root);
        Set<Integer>vis=new HashSet<>();
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        vis.add(start);
        int t=0;
        while(!q.isEmpty()){
            int s=q.size();
            while(s-->0){
                int curr=q.poll();
                for(int i:adj.get(curr)){
                    if(!vis.contains(i)){
                        q.add(i);
                        vis.add(i);
                    }
                }
            }
            t++;
        }
        return t-1;
    }
    public void graph(TreeNode root){
        if(root==null)
            return;
        adj.putIfAbsent(root.val,new ArrayList());
        if(root.left!=null){
            adj.get(root.val).add(root.left.val);
            adj.putIfAbsent(root.left.val,new ArrayList());
            adj.get(root.left.val).add(root.val);
            graph(root.left);
        }
        if(root.right!=null){
            adj.get(root.val).add(root.right.val);
            adj.putIfAbsent(root.right.val,new ArrayList());
            adj.get(root.right.val).add(root.val);
            graph(root.right);
        }
    }
}