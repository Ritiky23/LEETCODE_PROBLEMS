class Solution {

    public List<Integer> perfectSquares(List<Integer>l, int r)
    {
        for (int i = 1; i <= r; i++) 
        {
            if (Math.sqrt(i) == (int)Math.sqrt(i))
            {
                l.add(i);
            }
        }
        return l;
    }

    public int solve(List<Integer>l,int n,int i,int[][]dp)
    {
        if(n==0)
        {
            return 0;
        }
        if(n<0||i>=l.size())
        {
            return Integer.MAX_VALUE-1;
        }
        if(dp[n][i]!=-1)
        {
            return dp[n][i];
        }
        int ans=1+solve(l,n-l.get(i),i,dp);
        ans=Math.min(ans,solve(l,n,i+1,dp));
        return dp[n][i]=ans;
    }
 
    public int numSquares(int n) {
        List<Integer>l=new ArrayList<>();
        l=perfectSquares(l,n);
        int[][]dp=new int[n+1][l.size()+1];
        for(int i=0;i<n+1;++i)
        {
            for(int j=0;j<l.size()+1;++j)
            {
                dp[i][j]=-1;
            }
        }
        return solve(l,n,0,dp);
    }
}