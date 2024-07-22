class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> h=new HashMap<>();
        for(int i=0;i<names.length;i++){
            h.put(heights[i],names[i]);
        }
        String[] ans=new String[names.length];
        Arrays.sort(heights);
        int k=0;
        for(int i=heights.length-1;i>=0;i--){
            ans[k++]=h.get(heights[i]);
        }
        return ans;
        
    }
}
