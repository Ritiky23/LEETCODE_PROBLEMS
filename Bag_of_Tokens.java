class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i=0;
        int j=tokens.length-1;
        int ans=0;
        int max=0;
        while(i<=j){
            if(tokens[i]<=power){
                power-=tokens[i];
                ans++;
                max=Math.max(max,ans);
                i++;
            }
            else if(ans>0){
                power+=tokens[j];
                j--;
                ans--;
            }
            else return max;
            
            }
            return max;
        }
        
    }
