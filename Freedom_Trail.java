class Solution {
    public int findRotateSteps(String ring, String key) {
        int store[][]=new int[ring.length()][key.length()];
        for(int i=0;i<ring.length();i++){
            for (int j=0;j<key.length();j++){
                store[i][j]=1000;
            }
        }
        return find(ring, key, 0, 0, store);
    }

    public int find(String ring, String key, int r, int k,int[][] stores){
        if(k==key.length()) return 0;
        if(stores[r][k]!=1000) return stores[r][k];
        int res=Integer.MAX_VALUE;
        for(int i=0;i<ring.length();i++){
            if(key.charAt(k)==ring.charAt(i)){
                int sub=Math.abs(r-i);
                int min=Math.min(sub,ring.length()-sub);
                res=Math.min(res,min+1+find(ring,key,i,k+1,stores));
                stores[r][k]=res;
            }
        }
        return res;
    }

}
