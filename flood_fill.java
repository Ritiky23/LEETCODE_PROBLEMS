class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans=image;
        int inicolor=image[sr][sc];
        int[] delrow={-1,0,+1,0};
        int[] delcol={0,+1,0,-1};
        dfs(sr,sc,image,ans,delrow,delcol,inicolor,color);  
        return ans; 
    }
    public void dfs(int r, int c, int[][] image,int[][] ans,int[] delrow,int[] delcol,
    int inicolor,int newcolor){
        ans[r][c]=newcolor;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++){
            int nr=r+delrow[i];
            int nc=c+delcol[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && image[nr][nc]==inicolor && ans[nr][nc]!=newcolor){
                dfs(nr,nc,image,ans,delrow,delcol,inicolor,newcolor);
            }
        }

    }
}
