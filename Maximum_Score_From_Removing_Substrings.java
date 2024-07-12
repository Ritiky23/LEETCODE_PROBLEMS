class Solution {
    public int maximumGain(String s, int x, int y) {
        String pref = x > y ? "ab" : "ba";
        int minG = Math.min(x, y), mG = Math.max(x, y);
        int hP = 0, lP = 0, gain = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == pref.charAt(1)) {
                if (hP > 0) {
                    gain += mG;
                    hP--;
                } else lP++;
            } else if (ch == pref.charAt(0)) hP++;
            else {
                gain += Math.min(hP, lP) * minG;
                hP = 0;
                lP = 0;
            }
        }
        return gain + Math.min(hP, lP) * minG;
    }
}
