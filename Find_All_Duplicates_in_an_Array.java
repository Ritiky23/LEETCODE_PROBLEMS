class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int bitPlus = 65536;
        int bitMinus = bitPlus - 1;

        for (int i = 0; i < nums.length; i++) {
            int idx = nums[i] & bitMinus;
            if (nums[idx - 1] > bitPlus) {
                res.add(idx);
            } else {
                nums[idx - 1] |= bitPlus;
            }
        }

        return res;
    }
}
