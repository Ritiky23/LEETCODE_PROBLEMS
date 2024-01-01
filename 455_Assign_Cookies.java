class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        for(int childrenG: g) {
            int minimumS = -1;
            for(int i=0; i<s.length; i++) {
                if(s[i] >= childrenG && (minimumS == -1 || s[i] < s[minimumS])) {
                    minimumS = i;
                }
            }
            if(minimumS != -1) {
                s[minimumS] = -1 * s[minimumS];
                count++;
            }
        }
        return count;
    }
}