class Solution{
    static int findSingle(int n, int arr[]){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i: arr){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            Integer value = entry.getValue();
            if(value%2==1) return entry.getKey();
        }
        return 0;
    }
}
