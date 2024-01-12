class Solution {
    public boolean halvesAreAlike(String s) {
        
        s = s.toLowerCase();

        int count = 0;

        int j = s.length()/2;

        for(int i=0; i<s.length()/2; i++)
        {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j+i);

            if(c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') count++;
            if(c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u') count--;
        }

        if(count == 0) return true;
        return false;
    }
}