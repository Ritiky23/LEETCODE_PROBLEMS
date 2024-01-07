class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int result = 0;
        int n = nums.length;
        HashMap<Long, Integer>[] hm = new HashMap[n];

        for (int i = 0; i < n; i++) {
            hm[i] = new HashMap<>();
            for (int j = 0; j < i; j++) {
                long diff = (long) nums[i] - nums[j];
                Integer countAtJ = hm[j].getOrDefault(diff, 0);
                hm[i].put(diff, hm[i].getOrDefault(diff, 0) + countAtJ + 1);
                result += countAtJ;
            }
        }

        return result;
    }
}