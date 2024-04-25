class Solution {
    public int longestIdealString(String s, int k) {
        int n = s.length();
        int ret = 0;
        int[] map = new int[26];

        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int max = 0;
            for(int j = 0; j <= k; j++) {
              if((c - 'a') + j <  26) {
                max = Math.max(map[(c - 'a') + j]  + 1 , max);
              }
              if((c - 'a') - j >= 0) {
                max = Math.max(map[c - 'a' - j] + 1, max);
              }
            }
            map[c - 'a'] = max;
            ret = Math.max(max, ret);
        }

        return ret;
    }
}
