class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())
            return false;
        int w1[] = new int[26], w2[] = new int[26];
        for(int i = 0; i < word1.length(); i++){
            w1[word1.charAt(i) - 'a']++;
            w2[word2.charAt(i) - 'a']++;
        }
        for(int i = 0; i < w1.length; i++){
            if(w1[i] == w2[i]){
                continue;
            }
            if(w1[i] == 0 || w2[i] == 0) return false;
        }
        Arrays.sort(w1);
        Arrays.sort(w2);
        for(int i = 25; i >= 0; i--){
            if(w1[i] != w2[i]) return false;
            if(w1[i] == 0) break;
        }
        return true;
    }
}