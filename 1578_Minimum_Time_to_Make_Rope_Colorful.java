class Solution {
    public int minCost(String s, int[] t) {
        int c=0;
        List<Character> ch=new ArrayList<>();
        List<Integer> a= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            ch.add(s.charAt(i));
            a.add(t[i]);
        }
 int i = ch.size() - 2;
        while (i >= 0) {
            if (ch.get(i) == ch.get(i + 1)) {
                int min = Math.min(a.get(i), a.get(i + 1));
                c += min;
                if (min == a.get(i + 1)) {
                    ch.remove(i + 1);
                    a.remove(i + 1);
                } else {
                    ch.remove(i);
                    a.remove(i);
                }
            }
            i--;
        }
        return c;
    }
}