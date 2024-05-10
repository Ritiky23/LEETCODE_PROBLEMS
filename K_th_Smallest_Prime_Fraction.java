class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int[] ans=new int[2];
        HashMap<Double,int[]> h=new HashMap<>();
        int a1=0;
        int a2=0;
        double min=Double.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                double p=(double)arr[i]/arr[j];
                int[] b=new int[2];
                b[0]=arr[i];
                b[1]=arr[j];
                h.put(p,b);
                    //System.out.println("here "+p+" "+arr[i]+" "+arr[j]);
            }
        }
        List<Double> lst=new ArrayList<>(h.keySet());
        Collections.sort(lst);
        double g=lst.get(k-1);
        int[] result=h.get(g);
        return result; 
    }
}
