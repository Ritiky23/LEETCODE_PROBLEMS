class Pair{
int first;
int sec;
int third;
    public Pair(int _first, int _sec, int _third){ //first -> initial value ,  sec -> row, third -> col
        first= _first;
        sec= _sec;
        third= _third;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        if(grid[0][0]==1 || grid[n-1][m-1]==1) return -1;
        if(n==1 && grid[n-1][m-1]==0) return 1;
        Queue<Pair> q=new LinkedList<Pair>();
        int[][] dis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dis[i][j]=(int)1e9;
            }
        }
        int[] rrow={0,0,-1,1,-1,-1,1,1};
        int[] ccol={-1,1,0,0,-1,1,-1,1};
        q.add(new Pair(1,0,0));
        while(!q.isEmpty()){
            Pair pair=q.poll();
            int dist=pair.first;
            int row=pair.sec;
            int col=pair.third;
            for(int i=0;i<8;i++){
                int nRow=row+rrow[i];
                int nCol=col+ccol[i];
                if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && 
                   grid[nRow][nCol] == 0 && dist + 1 < dis[nRow][nCol]){   
                    if(nRow == n-1 && nCol == m-1){ 
                        return dist + 1;
                    }
                    dis[nRow][nCol]= dist+1;  
                    q.add(new Pair(dist+1, nRow, nCol)); 
                }
            }

        }
        return -1;
    }
}
