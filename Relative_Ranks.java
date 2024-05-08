class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> h=new HashMap<>();
        String[] s=new String[score.length];
        int[] p=new int[score.length];
        for(int i=0;i<score.length;i++){
            h.put(score[i],i);
            p[i]=score[i];
        }
    Arrays.sort(p);
        for(int i=0;i<p.length;i++){
            int o = h.get(p[score.length - 1 - i]);
            int r=i+1;
            if(r==1){
                s[o]="Gold Medal";
            }
            else if(r==2){
                s[o]="Silver Medal";
            }
            else if(r==3){
                s[o]="Bronze Medal";
            }
            else{
                s[o]=""+r;
            }
        }
        return s;
    }
}
