class Solution {
    public int heightChecker(int[] heights) {
        int[] copy = heights.clone();
        Arrays.sort(copy);
        int c = 0, n = heights.length;
        for(int i = 0; i < n; i++){
            if(heights[i]!=copy[i])c++;
        }
        return c;
    }
}
