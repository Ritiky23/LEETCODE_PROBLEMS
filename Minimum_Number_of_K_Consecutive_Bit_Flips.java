class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length, flips = 0;
        Queue<Integer> numberOfFlipsForWindow = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(nums[i] == numberOfFlipsForWindow.size() % 2){
                if(i + k - 1 >= n)   return -1;               
                flips++;                                     
                numberOfFlipsForWindow.add(i + k - 1);     
            }
            while(!numberOfFlipsForWindow.isEmpty() && numberOfFlipsForWindow.peek() <= i)  //if we are all done with the index remove it from queue
                numberOfFlipsForWindow.poll();
        }
        return flips;
    }
}
