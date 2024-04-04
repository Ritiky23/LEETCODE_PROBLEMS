class Solution {
    public static long sumSubstrings(String str) {
        long ans = 0;
        long multiplier = 1; // multiplier to handle the contribution of each digit
        
        // Iterate through each digit from left to right
        for (int i = str.length() - 1; i >= 0; i--) {
            // Calculate contribution of current digit to all substrings
            ans += (str.charAt(i) - '0') * (i + 1) * multiplier;
            ans %= 1000000007; // Modulo to avoid integer overflow
            
            // Update multiplier for the next iteration
            multiplier = (multiplier * 10 + 1) % 1000000007;
        }
        
        return ans;
    }
}
