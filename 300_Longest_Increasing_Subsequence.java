class Solution {
    int index(List<Integer> l ,int n){
        int le=0;int r =l.size()-1;
        while(le<r){
            int m = (le+r)/2;
            if(n>l.get(m))
            le = m+1;
            else
            r =m;
        }
        return le;
    }
    public int lengthOfLIS(int[] nums) {
        List<Integer> l = new ArrayList<>();
         l.add(nums[0]);
        int m =1;
        for(int i=1;i<nums.length;i++){
            int num = nums[i];
            if(num>l.get(l.size()-1))
            l.add(num);
            else{
                int ind = index(l,num);
                l.set(ind,num);
            }
            m = Math.max(m,l.size());
        }
        return m;
    }
}