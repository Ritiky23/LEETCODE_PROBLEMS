class Solution {
    public int matrixScore(int[][] grid) {
        if(grid.length==1&&grid[0].length==1) return 1;
        for(int i=0;i<grid.length;i++)
        {
            int t=0;
            for(int j=0;j<grid[i].length;j++)
            {
                if(j==0 &&  grid[i][0]==0)  t++;                  
                if(t!=0)    grid[i][j]^=1;
            }
        }
        int tc=0,ans=0;
        for(int i=0;i<grid[0].length;i++)
        {
            int c1=0,c0=0;
            for(int j=0;j<grid.length;j++)
            {
                if(tc==0)
                {
                    if(grid[j][i]==1) c1++;
                    else c0++;
                }
                else
                grid[j][i]^=1;
            }
            if(c0>c1)
            {
                tc++;
                i-=1;
            }
            else
            tc=0;
        }


        System.out.print("[");
        for(int i=0;i<grid.length;i++)
        {
            String s="";
            System.out.print("[");
            for(int j=0;j<grid[i].length;j++)
            {
                System.out.print(grid[i][j]+",");
                s+=grid[i][j];
            }
            System.out.print("]"+",");
            ans+=Integer.parseInt(s,2);  
        }
        System.out.print("]");
        return ans;        
    }
}
