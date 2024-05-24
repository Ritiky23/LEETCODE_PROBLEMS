class Solution {
    private int res = 0;
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        Map<Character, Integer> scoreMap = new HashMap<>();
        for (int i = 0; i < score.length; ++i) scoreMap.put((char)(i + 'a'), score[i]);
        Map<Character, Integer> letterMap = new HashMap<>();
        for (char l: letters) {
            letterMap.put(l, letterMap.getOrDefault(l, 0) + 1);
        }
        backtrack(words, 0, letterMap, scoreMap, new ArrayList<>());
        return res;
    }
    
    private void backtrack(String[] words, int index, Map<Character, Integer> letterMap, Map<Character, Integer> scoreMap, List<String> list) {
        
        if (index == words.length) {
            int tmpScore = 0;
            Map<Character, Integer> letterMapCopy = new HashMap<>(letterMap);
            for (String str: list) {
                for (char ch: str.toCharArray()) {
                    int count = letterMapCopy.getOrDefault(ch, 0);
                    if (count == 0) return;
                    --count;
                    if (count == 0) letterMapCopy.remove(ch);
                    else letterMapCopy.put(ch, count);
                    tmpScore += scoreMap.get(ch);
                }
            }
            res = Math.max(res, tmpScore);
            return;
        } 
        
        String curStr = words[index];
        list.add(curStr);
        backtrack(words, index + 1, letterMap, scoreMap, list);
        list.remove(list.size() - 1);
        backtrack(words, index + 1, letterMap, scoreMap, list);

    }
}
