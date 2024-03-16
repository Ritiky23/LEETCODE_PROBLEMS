class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int sum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) sum--;
            else sum++;
            if(sum==0) ans=Math.max(ans,i+1);
            if(h.containsKey(sum)){
                ans=Math.max(i-h.get(sum),ans);
            }
            else h.put(sum,i);
        }
        return ans;
        
    }
}
