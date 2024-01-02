class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer,Integer> m = new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            max=Math.max(max,m.getOrDefault(nums[i],0));
        }
        for(int i=0;i<max;i++){
            List<Integer> l = new ArrayList<>();
            for(Map.Entry e:m.entrySet()){
                int k = (int) e.getKey();
                int v = (int) e.getValue();
                if(v>0)
                    l.add(k);
                m.put(k,m.getOrDefault(k,0)-1);
            }
            list.add(l);
        }
        return list;
    }
}