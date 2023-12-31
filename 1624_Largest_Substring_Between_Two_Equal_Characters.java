class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int a,max=0;
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            a = s.lastIndexOf(ch)-s.indexOf(ch);
            max=Math.max(max,a);
        }
        return max-1;
    }
}