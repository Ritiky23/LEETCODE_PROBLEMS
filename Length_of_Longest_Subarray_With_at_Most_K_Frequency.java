class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int i = 0,j=0,max = 0;
        while(i<nums.length){
            if(!map.containsKey(nums[i]))
                map.put(nums[i],1);
            else{
                if(map.get(nums[i])>=k){
                    while(map.get(nums[i])>=k){
                        map.put(nums[j],map.get(nums[j])-1);
                        j++;
                    }
                }
                map.put(nums[i],map.get(nums[i])+1);
            } 
            max = Math.max(max,i-j+1);
            i++;
        }
        return max;
    }
}
