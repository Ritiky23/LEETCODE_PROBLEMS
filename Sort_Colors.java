class Solution {
    public void sortColors(int[] nums) {
        int countz=0;
        int counto=0;
        int countt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                countz+=1;
            }
            else if(nums[i]==1){
                counto+=1;
            }
            else{
                countt+=1;
            }
        }
        int j=0;
        int index=0;
        while(j<countz){
            nums[index]=0;
            index++;
            j++;
        }
        j=0;
        while(j<counto){
            nums[index]=1;
            index++;
            j++;
        }
        j=0;
        while(j<countt){
            nums[index]=2;
            index++;
            j++;
        }
        
    }
}
