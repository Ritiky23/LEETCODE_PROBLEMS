class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp,-1);
        return h(0,n,dp);
        
    }
    public int h(int pos,int n,int []dp){
        if(pos>n) return 0;
        if(pos==n) return 1;
        if(dp[pos]!=-1) return dp[pos];
        dp[pos]=h(pos+1,n,dp)+h(pos+2,n,dp);
        return dp[pos];
    }
}