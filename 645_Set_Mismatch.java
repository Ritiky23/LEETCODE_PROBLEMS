class Solution {
    public int[] findErrorNums(int[] nums) {
        int n= nums.length;
        Map<Integer,Integer> m=new HashMap<>();
        int[] a=new int[2];
        for(int i=0;i<n;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            if(m.get(nums[i])==2){
                a[0]=nums[i];
            }
        }
        for(int i=1;i<=n;i++){
            if(!m.containsKey(i)){
                a[1]=i;
                break;
            }
        }
        return a;
    }
}