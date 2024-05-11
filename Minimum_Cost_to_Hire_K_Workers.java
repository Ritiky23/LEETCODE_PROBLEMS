class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        double[][] ratio = new double[n][2];
        
        for (int i = 0; i < n; i++) {
            ratio[i][0] = (double) wage[i] / quality[i];
            ratio[i][1] = (double) quality[i];
        }
        
        Arrays.sort(ratio, (a, b) -> Double.compare(a[0], b[0]));
        
        PriorityQueue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        double minCost = Double.MAX_VALUE;
        double qualitySum = 0.0;
        
        for (double[] r : ratio) {
            maxHeap.offer(r[1]);
            qualitySum += r[1];
            
            if (maxHeap.size() > k) {
                qualitySum -= maxHeap.poll();
            }
            
            if (maxHeap.size() == k) {
                minCost = Math.min(minCost, qualitySum * r[0]);
            }
        }
        
        return minCost;
    }
}
