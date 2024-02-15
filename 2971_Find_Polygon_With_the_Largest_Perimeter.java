import java.util.Arrays;

class Solution {
public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);        
        int count = 0;
        long sum = 0, curr = 0;        
        sum = 1L * (nums[0] + nums[1]);
        count = 2;
        for (int i = 2; i < nums.length; i++) {            
            if (1L * nums[i] < sum) {
                sum += 1L * nums[i];                
                curr = sum;
                count++;            
            } else {
                sum += 1L * nums[i];            
            }
        }
        if (count == 2) return -1;
        return curr; 
    }}