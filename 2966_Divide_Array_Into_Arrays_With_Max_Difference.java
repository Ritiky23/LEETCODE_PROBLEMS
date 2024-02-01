import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<int[]> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i += 3) {
            if (i + 2 < n && nums[i + 2] - nums[i] <= k) {
                result.add(new int[]{nums[i], nums[i + 1], nums[i + 2]});
            } else {
                return new int[][]{};
            }
        }
        return result.toArray(new int[0][]);
    }
}