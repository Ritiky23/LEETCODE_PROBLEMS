class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        if(jobDifficulty.length < d) return -1;

        int n = jobDifficulty.length;
        int maxi = Arrays.stream(jobDifficulty).max().orElse(Integer.MIN_VALUE);

        int[][][] dp = new int[n+1][d+1][maxi+1];
        for(int[][] dd: dp){
            for(int[] ddd: dd){
                Arrays.fill(ddd, -1);
            }
        }

        return solve(jobDifficulty, 0, d, 0, dp);
    }

    static int solve(int[] jobs, int ind, int d, int maxi, int[][][] dp){
        if(d == 1){
            int maxDefiiculty = Integer.MIN_VALUE;
            for(int i = ind; i < jobs.length; i++){
                maxDefiiculty = Math.max(maxDefiiculty, jobs[i]);
            }
            return maxDefiiculty;
        }

        if(ind > jobs.length - d){
            return Integer.MAX_VALUE;
        }
        
        if(dp[ind][d][maxi] != -1) return dp[ind][d][maxi];

        maxi = Math.max(maxi, jobs[ind]);

        int pick = maxi + solve(jobs, ind+1, d - 1, 0, dp);
        int notPick = solve(jobs, ind+1, d, maxi, dp);

        return dp[ind][d][maxi] = Math.min(pick, notPick);
    }
}