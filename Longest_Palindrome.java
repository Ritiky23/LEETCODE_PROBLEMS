class Solution {
    public int longestPalindrome(String s) {
        
        int count=0;
        HashMap<Character,Integer>set=new HashMap<>();
        int n=s.length();
        for(char x:s.toCharArray()){
            set.put(x,set.getOrDefault(x,0)+1);
        }
        boolean bol=false;
        for(Map.Entry<Character,Integer> map:set.entrySet()){

            if(map.getValue()%2==0){
                count+=map.getValue();
            }
            else{
                bol=true;
                count+=map.getValue()-1;
            }
        }
        if(bol){
            return count+1;
        }
        return count;
    }
}
