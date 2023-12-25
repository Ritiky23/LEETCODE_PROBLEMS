class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] t = new int [n + 1];
        t[n] = 1;

        for(int i = n - 1; i > -1; i--){
            if(s.charAt(i) == '0') continue;
            t[i] = t[i + 1];

            if(i < n - 1 ){
                if(s.charAt(i) == '1' || (s.charAt(i ) == '2' && s.charAt(i + 1) < '7'))
                t[i] += t[i + 2];
            }
        }
        return t[0];
    }
}