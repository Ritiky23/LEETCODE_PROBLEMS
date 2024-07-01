class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(count!=flag){
                flag=0;
                count=0;
            }
            if(arr[i]%2!=0){
                count++;
            }
            if(count==3){
                return true;
            }
            flag++;
        }
        return false;
    }
}
