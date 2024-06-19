class Solution {
    int canMake(int[] bloomDay, int mid, int k) {
        int l = bloomDay.length;
        int bouqCount = 0;
        int consecutive_count = 0;
        for (int i = 0; i < l; i++) {
            if (bloomDay[i] <= mid) {
                consecutive_count++;
            } else {
                consecutive_count = 0;
            }
                if (consecutive_count == k) {
                    bouqCount++;
                    consecutive_count = 0;
                }
            }
        return bouqCount;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int l = bloomDay.length;
        int ans = -1;
        int startDay = 0;
        int endDay =0;
        for(int day: bloomDay) if(day>endDay) endDay = day;
        while (startDay <= endDay) {
            int mid = startDay + (endDay - startDay) / 2;
            if (canMake(bloomDay, mid, k) >= m) {
                ans = mid;
                endDay = mid - 1;
            } else {
                startDay = mid + 1;
            }
        }
        return ans;
    }
}
