class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a=new int[2];
        int x=-1;
        int y=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                x=i;
                break;
            }
        }
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]==target){
                y=j;
                break;
            }
        }
        a[0]=x;
        a[1]=y;
        return a;
    }
    
}