class Solution {
    public int trap(int[] height) {
        List<Integer> lb=new ArrayList<>();
        List<Integer> rb=new ArrayList<>();
        int m=height[0];
        int water=0;

        //LEFTBOUND
        lb.add(0);
        for(int i=0;i<height.length;i++){
            if(height[i]>m){
                m=height[i];
            }
            lb.add(m);
        }
        //RIGHTBOUND
        m=0;
        for(int i=height.length-1;i>=0;i--){
            if(height[i]>m){
                m=height[i];
            }
            rb.add(m);
        }
       Collections.reverse(rb);
        rb.add(0);

        //TOTAL TRAP
        for(int i=0;i<height.length;i++){
            int min=Math.min(lb.get(i),rb.get(i));
            if(min>0 && min-height[i]>0)
                water+=(min-height[i]);
        }
        
        return water;
    }
}
