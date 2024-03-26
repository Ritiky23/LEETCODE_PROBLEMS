class Solution {
    public int firstMissingPositive(int[] nums) {
        int currIdx = 0;
        while(currIdx < nums.length){
            int correctIdx = nums[currIdx]-1;
            if(nums[currIdx] >= 1 && correctIdx < nums.length){
                if(nums[currIdx] != nums[correctIdx]){
                    int temp = nums[currIdx];
                    nums[currIdx] = nums[correctIdx];
                    nums[correctIdx] = temp;
                }
                else currIdx++;
            }
            else currIdx++;
        }
        
        int i = 0;
        for(; i < nums.length; i++){
            if(nums[i] != i+1) return i+1;
        }
        return i+1;
    }
}
