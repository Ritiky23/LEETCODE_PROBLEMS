class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> current= new ArrayList<>();
        backtrack(s,0,current,result);
        return result;

    }
    public boolean isPalindrome(String s, int start,int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public void backtrack(String s,int index,List<String> current,List<List<String>> result){
        if(index == s.length()){
            result.add(new ArrayList<>(current)); 
            return;
        }
        for(int i = index; i < s.length();i++){
            if(isPalindrome(s,index,i)){
                current.add(s.substring(index,i+1));
                backtrack(s,i+1,current,result);
                current.remove(current.size()-1);
            }
        }
    }
}
