class Solution {
    public int minOperations(int[] nums) {
        int minOperations = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int freq = entry.getValue();
            while(freq != 0){
                if(freq%3 == 0){
                    freq -= 3;
                    minOperations++;
                }else if(freq%2==0){
                    freq -= 2;
                    minOperations++;
                }else if(freq == 1){
                    return -1;
                }else{
                    freq -= 3;
                    minOperations++;
                }
            }
        }
        return minOperations;
    }
}