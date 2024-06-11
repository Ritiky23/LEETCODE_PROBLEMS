class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        int n=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    swap(arr1,n,j);
                    n++;
                }
            }
        }
        for(int i=n;i<arr1.length-1;i++){
            for(int j=n;j<arr1.length-i-1+n;j++){
                if(arr1[j]>arr1[j+1]){
                    swap(arr1,j,j+1);
                }
            }
        }return arr1;
    }
    void swap(int[] arr ,int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
