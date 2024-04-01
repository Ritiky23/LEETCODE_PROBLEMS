class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        int p=s.length()-1;
        while(s.charAt(p)==' '){
            p--;
        }
        for(int i=p;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            else c++;
        }
        return c;
        
    }
}
