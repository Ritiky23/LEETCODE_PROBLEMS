class Solution {
    public boolean canPut(int[] position, int m, int mid) {
        int count = 1;
        int last = position[0];

        for (int i = 1; i < position.length; i++) {
            if (position[i] - last >= mid) {
                count++;
                last = position[i];
                if (count >= m) return true;
            }
        }
        return false;
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1, high = position[position.length - 1] - position[0];
        int optimum = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canPut(position, m, mid)) {
                optimum = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return optimum;
    }
}
