class Solution {
    public int minFallingPathSum(int[][] m) {
        int n = m.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
              m[i][j]+=Math.min(m[i-1][Math.max(j-1, 0)],
                        Math.min(m[i-1][j], m[i-1][Math.min(j+1, n-1)]));
            }
        }
        int minsum = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            minsum = Math.min(minsum, m[n-1][j]);
        }

        return minsum;
    }
}