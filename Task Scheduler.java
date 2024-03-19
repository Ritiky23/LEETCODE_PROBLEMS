class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for(char ch: tasks){
            freq[ch-'A']++;
        }


        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int data: freq){
            if(data > 0){
                pq.add(data);
            }
        }

        int time = 0;

        while(!pq.isEmpty()){
            List<Integer> list = new ArrayList();
            int cycle = n+1;
            while(cycle-- > 0 && !pq.isEmpty()){
                list.add(pq.remove()-1);
            }

            
            for(int data: list){
                if(data > 0) pq.add(data);
            }

            if(pq.isEmpty()){
                time += list.size();
            }else{
                time += n+1;
            }
        }

        return time;

        
    }
}
