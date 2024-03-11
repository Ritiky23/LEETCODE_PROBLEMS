class Solution {
    public String customSortString(String order, String s) {
        HashSet<Character> set=new HashSet<>();
        String ans="";
        for(char c:order.toCharArray()){
            set.add(c);
        }
        for(char c: order.toCharArray()){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==c){
                    ans+=c;
                }
            }
        }
        for(char c: s.toCharArray()){
            if(!set.contains(c)) ans+=c;
        }
        return ans;
    }
}
