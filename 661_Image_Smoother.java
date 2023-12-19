class Solution {
    public int[][] imageSmoother(int[][] img) {
        int cend=0;
        int[][] res=new int[img.length][img[0].length];

        for(int i=0;i<img.length;i++){
            for(int j=0;j<img[0].length;j++){
                int sum=0;
                int c=0;
                        for(int k=i-1;k<=i+1;k++){
                            for(int h=j-1;h<=j+1;h++){
                                if((k>=0 && k<img.length) && h>=0 && h<img[0].length){
                                        sum+=img[k][h];
                                        c++;
                            }
 
                            }
                        }
                        res[i][j]=sum/c;
            }
        }
        return res;
        
    }
}