class Solution {
    public int appendCharacters(String s, String t) {
        int count=0; 
        int index=-1;
        for(int i=0;i<t.length();i++){ 
          index=s.indexOf(t.charAt(i)+"",index+1);
          if(index==-1){
            return t.length()-count;
          }
           count++;
        }
        return 0;

    }
}
