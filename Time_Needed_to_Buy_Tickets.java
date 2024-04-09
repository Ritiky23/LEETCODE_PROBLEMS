class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i,c=0;
        while(true){
            for(i=0;i<tickets.length;i++){
                if(tickets[i]!=0){
                c++;
                tickets[i]--;
                }
            
            if(tickets[k]==0)
            return c;
            }
        }
    }
}
