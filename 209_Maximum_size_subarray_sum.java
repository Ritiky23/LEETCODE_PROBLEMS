class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        int i=0,j=0;
        int sum=0;
        int m=Integer.MAX_VALUE;
        List<Integer> l=new ArrayList<>();
        while(j<nums.length){
            sum+=nums[j];
            while(sum>=t){
                if(j-i+1<m) m=j-i+1;
                sum=sum-nums[i];
                i++;
            }
            j++;

        }
    
        if(m==Integer.MAX_VALUE) m=0;
        return m;
    }
}