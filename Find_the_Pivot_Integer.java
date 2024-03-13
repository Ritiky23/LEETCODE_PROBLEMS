class Solution {
    public int pivotInteger(int n) {
        int[] a=new int[n+1];
        int[] b=new int[n+1];
        a[1]=1;
        a[n]=n;
        if(n==1) return 1;
        for(int i=2;i<=n;i++){
            a[i]=a[i-1]+i;
            System.out.println(a[i]);
        }
            System.out.println("hi");
        int sum=n;
        for(int i=n-1;i>=2;i--){
            sum+=i;
            System.out.println(sum);
            if(sum==a[i]) return i;
        }
        return -1;
        
    }
}
