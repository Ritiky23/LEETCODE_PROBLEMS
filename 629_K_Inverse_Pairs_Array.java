class Solution {
    public int kInversePairs(int n, int k) {
        final int MOD = (int)(1e9+7);
        int[] prev = new int[k+1];
        prev[0] = 1;

        for(int i=1; i<=n; i++) {
            int[] cur = new int[k+1];
            int total = 0;
            for(int j=0; j<=k; j++) {

                if(j >= i) {
                    total = (total - prev[j - i] + MOD) % MOD;
                }

                total = (prev[j] + total) % MOD;
                cur[j] = total;
            }

            prev = cur;
        }

        return prev[k];
    }
}

