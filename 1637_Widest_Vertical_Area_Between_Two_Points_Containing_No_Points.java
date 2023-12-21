class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] a=new int[points.length];
        for(int i=0;i<points.length;i++){
                a[i]=points[i][0];
                System.out.println(a[i]);
            }
            Arrays.sort(a);
            int m=0;
            for(int i=0;i<a.length-1;i++){
                m=Math.max(m,a[i+1]-a[i]);
            }
        

        return m;}
    }