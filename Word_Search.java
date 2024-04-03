class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        boolean[][] vis = new boolean[m][n];
        boolean ans = false;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    ans = helper(board, word, vis, i, j, 0);
                    if(ans){
                        return true;
                    }
                }
            }
        }
        return ans;
    }

    public boolean helper(char[][] board, String word, boolean[][] vis, int i, int j, int index){
        if(index==word.length()){
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || vis[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }

        vis[i][j] = true;
        if (helper(board, word, vis, i + 1, j, index + 1) ||
            helper(board, word, vis, i - 1, j, index + 1) ||
            helper(board, word, vis, i, j + 1, index + 1) ||
            helper(board, word, vis, i, j - 1, index + 1)) {
            return true;
        }
        vis[i][j] = false;
        return false;
    }
}
