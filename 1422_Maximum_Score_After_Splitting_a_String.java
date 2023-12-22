class Solution {
    public int maxScore(String s) {
        int z=0,c1=0;
        int m=Integer.MIN_VALUE;
        List<Character> b=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            b.add(s.charAt(i));
        }
    for(int i=0;i<b.size()-1;i++){
            c1=0;
            if(b.get(i)=='0'){
                z++;
            }
        for(int j=i+1;j<b.size();j++){
            if(b.get(j)=='1'){
                c1++;z
            }
        }
        m=Math.max(m,z+c1);
    }
    return m;
        
    }
}