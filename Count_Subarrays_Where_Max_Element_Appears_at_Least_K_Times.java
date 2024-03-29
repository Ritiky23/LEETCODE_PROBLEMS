class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=nums[0];
        for( int i=1; i<nums.length; i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
           
        }
     long ans=0;
     int initial=0; 
     int count=0;
     for( int last=0; last<nums.length; last++)
     {
        if(nums[last]==max)
        {
            count++;
        }
        while(count==k)
        {
            if(nums[initial]==max)
            {
                count--;
            }
             initial++;
        }
       ans+=initial;
     }
      return ans;
    }
   
}
