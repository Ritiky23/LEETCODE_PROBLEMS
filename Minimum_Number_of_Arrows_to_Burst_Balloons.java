class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) -> Integer.compare(a[1] , b[1]));
        int p=points[0][1];
        int c=1;
        for(int i=1;i<points.length;i++){
            if(p<points[i][0]){
                p=points[i][1];
                c++;
            }
            else Math.min(p,points[i][0]);
        }
    
        return c;
        
    }
}
