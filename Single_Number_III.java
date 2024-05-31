class Solution {
    public int[] singleNumber(int[] nums) {
        int txor = 0;
        for(int ele: nums){
            txor ^= ele;
        }

        int mask = (txor & (txor-1))^txor;
        int[] res = new int[2];
        for(int ele: nums){
            if((ele & mask) == 0){
                res[0] ^= ele;
            }else{
                res[1] ^= ele;
            }
        }
        return res;
    }
}
