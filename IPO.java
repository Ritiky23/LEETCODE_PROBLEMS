class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        List<int[]> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            list.add(new int[] {capital[i], profits[i]});
        }
        
        list.sort(Comparator.comparingInt(a -> a[0]));
        
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0;
        while(k-- > 0) {
            while(i < n && list.get(i)[0] <= w) {
                pq.add(list.get(i)[1]);
                i++;
            }
            if(pq.isEmpty()) {
                break;
            }
            w += pq.poll();
        }
        return w;
    }
}
