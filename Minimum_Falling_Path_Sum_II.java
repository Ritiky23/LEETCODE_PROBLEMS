class Solution {
    static Integer[][]dp;
    public int minFallingPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        dp=new Integer[n][m];
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            ans=Math.min(ans,solver(0,j,grid));
        }
        return ans;
    }

    private int solver(int i, int j, int[][] grid) {
        if(i<0||i>=grid.length||j<0||j>=grid[0].length)return Integer.MAX_VALUE;
        if(i==grid.length-1){
            if(j>=0 && j<=grid[0].length)return grid[i][j];
            else return Integer.MAX_VALUE ;
        }
        if(dp[i][j]!=null)return dp[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=0;k<grid[0].length;k++) {
            if(j!=k)min=Math.min(min,solver(i+1,k,grid));
        }
        return dp[i][j]=min+grid[i][j];
    }
}
