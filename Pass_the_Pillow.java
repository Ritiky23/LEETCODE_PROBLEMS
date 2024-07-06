class Solution {
    public int passThePillow(int n, int time) {
        int pos = 1; // Initialize position to 1
        int dir = 1; // Initialize direction to 1 (clockwise)

        // If time is less than n-1, simply return the position after time seconds
        if (n - 1 >= time) return time + 1;

        int t = 0; // Initialize time counter

        // Simulate passing the pillow until the time reaches the given time
        while (t < time) {
            t++; // Increment time

            if (pos < n && dir == 1) // If moving clockwise and not at the last person
                pos++;
            else if (pos == n) { // If at the last person
                dir = -1; // Change direction to counterclockwise
                pos--;
            } else if (pos == 1) { // If at the first person
                dir = 1; // Change direction to clockwise
                pos++;
            } else if (pos < n && dir == -1) // If moving counterclockwise and not at the first person
                pos--;
        }
        
        return pos; // Return the final position
    }
}
