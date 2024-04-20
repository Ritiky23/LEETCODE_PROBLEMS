class Solution {
    int index = 0;
    public void getIndex(int i, int j, List<int[]> answer, int[][] land){
        int x = i; int y = j;
        while(x < land.length && land[x][j] == 1){
            x++;
        }
        x--;
        while(y < land[0].length && land[i][y] == 1){
            y++;
        }
        y--;
        answer.add(new int[]{i,j,x,y});
        for(int k=i; k<=x; k++){
            for(int l=j; l<=y; l++){
                land[k][l] = -1;
            }
        }
        return;
    }
    public int[][] findFarmland(int[][] land) {
        if(land.length == 1 && land[0].length == 1 && land[0][0] == 0){
            return new int[][]{};
        }
        List<int[]> answer = new ArrayList<>();
        for(int i=0; i<land.length; i++){
            for(int j=0; j<land[0].length; j++){
                if(land[i][j] == 1){
                    getIndex(i, j, answer, land);
                }
            }
        }
        return answer.toArray(new int[answer.size()][]); //method to convert ArrayList to 2D array.
    }
}
