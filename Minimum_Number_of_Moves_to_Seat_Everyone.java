class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int len = seats.length, movs = 0;
        for(int indx = 0; indx < len; indx++){
            movs += Math.abs(seats[indx] - students[indx]);
        }
        return movs;
    }
}
