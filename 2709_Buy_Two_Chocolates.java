class Solution {
    public int buyChoco(int[] p, int money) {
        Arrays.sort(p);
        int i=p[0];
        int j=p[1];
        if((i+j)<=money){
            return money-(i+j);
        }
        return money;
    }
}