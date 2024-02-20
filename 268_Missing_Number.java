class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int m=nums[nums.length-1];
        int i=0;
        for(i=0;i<m+1;i++){
            if(i==nums[i]){
                continue;
            }
            else {
                ans=i;
                break;
            }
        }
        if(i==m+1){
            return m+1;
        }
        return ans;
                
    }
}