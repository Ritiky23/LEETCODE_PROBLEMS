class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int r=0;
        int m=0;
        int c=0;
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('o');
        set.add('i');
        set.add('u');
        while(r<s.length()){
          if (set.contains(s.charAt(r))) {
                c++;
            }
            if(r-l+1==k){
                m=Math.max(m,c);
                if(set.contains(s.charAt(l))) c--;
                l++;
            }
            r++;
        }
        return m;

        
    }
}
