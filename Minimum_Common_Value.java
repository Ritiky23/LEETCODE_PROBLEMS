class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(!set.contains(nums1[i])) set.add(nums1[i]);
        }
        int m=Integer.MAX_VALUE;
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                if(nums2[i]<m) m=nums2[i];
            }
        }
        if(set.contains(m)) return m;
        return -1;
        
    }
}
