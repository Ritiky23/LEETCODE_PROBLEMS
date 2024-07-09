class Solution {
    public double averageWaitingTime(int[][] customers) {
        long totalTime = 0;
        long chefTime = 0;
        for (int[] customer : customers) {
            int arrivalTime = customer[0];
            int orderTime = customer[1];
            chefTime = Math.max(chefTime, arrivalTime) + orderTime;
            totalTime += chefTime - arrivalTime;
        }
        return (double) totalTime / customers.length;
    }
}
