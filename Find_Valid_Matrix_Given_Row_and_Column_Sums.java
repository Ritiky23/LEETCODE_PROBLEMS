class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int row = rowSum.length;
        int col = colSum.length;

        int [][] res = new int[row][col];


        int i=0;
        int j=0;

        while(i<row && j<col){
            if(rowSum[i]<colSum[j]){
                res[i][j] = rowSum[i];
                colSum[j] -=rowSum[i];
                rowSum[i] = 0;
                
                i++;
            }else{
                res[i][j] = colSum[j];
                rowSum[i] -=colSum[j];
                colSum[j] = 0;
                j++;
            }
        }


        return res;

    }
}
