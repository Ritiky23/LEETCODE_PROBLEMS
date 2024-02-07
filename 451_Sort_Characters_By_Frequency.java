class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer>hashMap=new HashMap<>();
        for(char a : s.toCharArray()){
            hashMap.put(a, hashMap.getOrDefault(a, 0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap=new PriorityQueue<>((a, b) -> b.getValue()-a.getValue());
        for(Map.Entry<Character, Integer> entry : hashMap.entrySet()){
            maxHeap.offer(entry);
        }
        StringBuilder res = new StringBuilder();
        while(!maxHeap.isEmpty()){
            Map.Entry<Character,Integer> entry =maxHeap.poll();
            for(int i=0;i<entry.getValue();i++){
                res.append(entry.getKey());
            }
        }
            return res.toString();
    }
        

}