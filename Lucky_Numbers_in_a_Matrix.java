class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        Set<Integer> minRow = new HashSet<>();
        Set<Integer> maxCol = new HashSet<>();
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            minVal = Integer.MAX_VALUE;
            for(int j =0; j < m; j++){
                minVal = Math.min(minVal, matrix[i][j]);
            }
            minRow.add(minVal);
            
        }

        for(int i = 0; i < m; i++){
            maxVal = Integer.MIN_VALUE;
            for(int j =0; j < n; j++){
                maxVal = Math.max(maxVal, matrix[j][i]);
            }
            maxCol.add(maxVal);
            
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int a : minRow){
            if(maxCol.contains(a)){
                ans.add(a);
            }
        }
        return ans;
    }
}
