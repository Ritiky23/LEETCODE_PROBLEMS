class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            // If ch is not found in word, return the original word
            return word;
        }

        char[] charArray = word.toCharArray();

        int start = 0;
        int end = index;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        // Convert the char array back to a string and return
        return new String(charArray);
    }
}
