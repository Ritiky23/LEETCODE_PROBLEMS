class Solution {
    class Pair{
        int row;
        int col;
        int tm;
        Pair(int _row, int _col,int _tm){
            this.row=_row;
            this.col=_col;
            this.tm=_tm;
        }
    }
    public int orangesRotting(int[][] grid) {
        int[][] ans=new int[grid.length][grid[0].length];
        int cntf=0;
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2){
                   q.add(new Pair(i,j,0));
                   ans[i][j]=2;
                }
                else ans[i][j]=0;
                if(grid[i][j]==1) cntf++;
            }
        }
        int n=grid.length;
        int m=grid[0].length;
        int tm=0;
        int[] delr={-1,0,+1,0};
        int[] delc={0,+1,0,-1};
        int cnt=0;
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().tm;
            tm=Math.max(tm,t);
            q.remove();
            for(int i=0;i<4;i++){
                int nr=r+delr[i];
                int nc=c+delc[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && ans[nr][nc]==0 && grid[nr][nc]==1 ){
                    q.add(new Pair(nr,nc,t+1));
                    ans[nr][nc]=2;
                    cnt++;
                }
            }
        }
        if(cnt!=cntf) return -1;
        return tm;
    }

}
