class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c=nums[i];;
            h.put(c,h.getOrDefault(c,0)+1);
        }
        int m=0;
        for(Map.Entry<Integer,Integer> entry : h.entrySet()){
            int p=entry.getValue();
            m=Math.max(m,p);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> entry :h.entrySet()){
            int p=entry.getValue();
            if(p==m)ans+=p;
        }
        System.out.println(h);
        return ans;
    }
}
