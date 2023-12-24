class Solution {
    public int minOperations(String s) {
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            char a = (i % 2 == 0) ? '0' : '1';

            if (s.charAt(i) != a) {
                c++;
            }
        }
        return Math.min(c, s.length() - c);
    }
}