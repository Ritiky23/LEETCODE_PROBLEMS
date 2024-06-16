class Solution {
    public int minPatches(int[] nums, int n) {
        int patch = 0; 
        long maxReach = 0;
        int index = 0; 
        while (maxReach < n) {
            if (index < nums.length && nums[index] <= maxReach + 1) {
                maxReach += nums[index];
                index++;
            } 
            else {
                maxReach += maxReach + 1;
                patch++;
            }
        }
        return patch;
    }
}
