class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] p=new int[nums.length];
        int[] ans=new int[nums.length];
        int c=0;
        int f=0;
        Arrays.fill(ans,0);
        if(nums[0]==0){
            f=1;
            c++;
            p[0]=1;
        }
        else
        p[0] = nums[0];
        System.out.println(p[0]);
        int m = -1;
        for (int i = 1; i < nums.length; i++) {
        if (nums[i] == 0) {
        p[i] = p[i-1]*1;
        c++;
        m = i;
     } else {
        p[i] = p[i - 1] * nums[i];
    }
    //System.out.println(p);
        }
    if(c>1){
        Arrays.fill(ans,0);
        return ans;
    }
    if(f==1){
        Arrays.fill(ans,0);
        ans[0]=p[p.length-1];
       // System.out.println(m+" "+ans[m]);
        return ans;
    }
        for(int i=0;i<p.length;i++){
            if(m!=-1 && i!=m){
                ans[i]=0;
            }
            else if(i==m){
                ans[i]=p[p.length-1];
            }
            else{
                if(nums[i]==0) ans[i]=p[p.length-1];
                else
                ans[i]=p[p.length-1]/nums[i];
            }
        }
        
        return ans;
    }
}
