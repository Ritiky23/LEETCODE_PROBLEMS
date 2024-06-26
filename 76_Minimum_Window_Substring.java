public class Solution {
    public String minWindow(String s, String t) {
        if (s.isEmpty() || t.isEmpty()) {
            return "";
        }

        int[] dictT = new int[128];
        for (char c : t.toCharArray()) {
            dictT[c]++;
        }

        int required = 0;
        for (int count : dictT) {
            if (count > 0) {
                required++;
            }
        }

        int l = 0, r = 0;
        int formed = 0;

        int[] windowCounts = new int[128];
        int[] ans = { -1, 0, 0 };

        while (r < s.length()) {
            char c = s.charAt(r);
            windowCounts[c]++;

            if (dictT[c] > 0 && windowCounts[c] == dictT[c]) {
                formed++;
            }

            while (l <= r && formed == required) {
                c = s.charAt(l);

                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }

                windowCounts[c]--;
                if (dictT[c] > 0 && windowCounts[c] < dictT[c]) {
                    formed--;
                }

                l++;
            }

            r++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}