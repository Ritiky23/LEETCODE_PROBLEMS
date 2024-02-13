class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
            if(Palindrome(words[i])==true){
                return words[i];
            }
        }
        return "";
        
    }
    public Boolean Palindrome(String s){
        int i=0;
        int c=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
                return false;          
        i++;
        j--;
        } 
        return true;

    }   
}   