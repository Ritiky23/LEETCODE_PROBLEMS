class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int c=0, sum=0;
        for(int i: nums){
            sum+=i;
            if(map.containsKey(sum-goal)){
                c+=map.get(sum-goal);
                }
                map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return c;
        
    }
}
