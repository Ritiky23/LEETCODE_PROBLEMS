class Solution {
    int ans=0;
    public int minimumLength(String s) {
        func(s,0,s.length()-1);
        return ans;
        
    }
    public void func(String s,int i,int j){
        if (i<j && s.charAt(i)==s.charAt(j) && j-i==1) {
            ans=0;
            return;
        }
        if (i==j && s.charAt(i)==s.charAt(j)) {
            ans=1;
            return;
        }
        if(i<j && s.charAt(i)!=s.charAt(j) ){
            ans=j-i+1;
            return;
        }
            char c=s.charAt(i);
            if(s.charAt(i)==c && s.charAt(j)==c){
            while(i<j && (s.charAt(i))==c){
                i++;
            }
            if (i==j && s.charAt(i)==s.charAt(j)) {
            ans=0;
            return;
        }
            while(i<j && s.charAt(j)==c){
                j--;
            }
            System.out.println(i+" "+j);
            ans=j-i;
            func(s,i,j);}
            else ans=j-i+1;
    }
}
