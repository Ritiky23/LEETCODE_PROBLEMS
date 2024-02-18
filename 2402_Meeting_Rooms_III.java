class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (e1, e2) -> e1[0] - e2[0]);
        int usageCnt[] = new int[n], maxUsedRoom = 0;
        long roomsAvailTime[] = new long[n];
        for(int i = 0; i < meetings.length; i++){
            int bestSuitedRoom = -1, minWaitingRoom = -1;
            long delay = 0l;
            for(int j = 0; j < n; j++){
                if(roomsAvailTime[j] <= meetings[i][0]){
                    bestSuitedRoom = j;
                    break;
                }
                else if(minWaitingRoom == -1 || roomsAvailTime[minWaitingRoom] > roomsAvailTime[j])
                    minWaitingRoom = j;
            }
            if(bestSuitedRoom == -1){
                bestSuitedRoom = minWaitingRoom;
                delay = roomsAvailTime[bestSuitedRoom] - meetings[i][0];
            }
            roomsAvailTime[bestSuitedRoom] = meetings[i][1] + delay;
            if(++usageCnt[bestSuitedRoom] > usageCnt[maxUsedRoom] || (usageCnt[bestSuitedRoom] == usageCnt[maxUsedRoom] && bestSuitedRoom < maxUsedRoom))
                maxUsedRoom = bestSuitedRoom;
        }
        return maxUsedRoom;
    }
}