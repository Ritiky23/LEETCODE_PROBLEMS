class Solution {
    public static int slidingWind(int[] nums, int k){

        int n= nums.length;
        Map<Integer,Integer> freq = new HashMap<>();
        int left =0, right=0;
        int count = 0;
        
        while(right < n){
            int num = nums[right];
            freq.put(num, freq.getOrDefault(num, 0)+1);
            while(freq.size() > k){
                int num1 = nums[left];
                freq.put(num1, freq.get(num1) - 1);
                if(freq.get(num1) == 0){
                    freq.remove(num1);
                }
                left++;
            }
            count += (right - left + 1);
            right++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return slidingWind(nums, k) - slidingWind(nums, k-1);
    }
}
