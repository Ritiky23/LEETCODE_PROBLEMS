class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> ent:map.entrySet()){
            if(res.containsKey(ent.getValue())){
                return false;
            }
            res.put(ent.getValue(),0);
        }
        return true;
    }
}//update
