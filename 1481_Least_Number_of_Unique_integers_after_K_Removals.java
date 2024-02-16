class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        if(arr.length == 1){
            if(k > 0 ){
                return 0;
            }
        }
	        ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();

	        for(Integer val : arr){
	            map.put(val, map.getOrDefault(val, 0) +1);
	        }
	        int count = map.size();
	        for(int i = 1; i < count;i++) {
	

			for (Map.Entry<Integer, Integer> val : map.entrySet()) {
				if (k == 0 || k < i) {
					return map.size();
				}
				if (val.getValue() == i) {
					k -= map.get(val.getKey());
					map.remove(val.getKey());
				}

			}
	        	
	        }

	        
	        return map.size();

	    
    }
}