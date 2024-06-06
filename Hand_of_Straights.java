class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Arrays.sort(hand);
        boolean[] used = new boolean[hand.length];
        int index = 0;
        while(index < hand.length){
            boolean groupFormed = makeNewGroup(hand, used, groupSize, index);
            if(!groupFormed){
                return false;
            }else{
                index = newIndex(index, used);
            }
        }
        return true;    
    }
    private boolean makeNewGroup(int[] hand, boolean[] used , int groupSize, int index){
        boolean firstDone = false;
        int previousVal = 0;
        for(int i=index; i < hand.length; i++){
            if(!used[i]){
                if(!firstDone || (previousVal + 1 == hand[i])){
                    firstDone = true;
                    used[i] = true;
                    groupSize--;
                    previousVal = hand[i];
                }
            }
            if(groupSize <= 0){
                break;
            }
        }
        return groupSize <= 0;
    } 
    private int newIndex(int index, boolean[] used){
        for(int i=index; i < used.length;i++){
            if(!used[i]){
                return i;
            }
        }
        return used.length;
    } 
}
