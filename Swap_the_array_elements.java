
class Solution
{
    public void swapElements(int[] arr, int n)
    {
        // Code here
        if(n==1) return;
        int x=arr[0];
        int y=arr[1];
        for(int i=0;i<n-2;i++)
        {
            arr[i]=arr[i+2];
        }
        arr[n-2]=((n-2)%2==0)?x:y;
        arr[n-1]=((n-1)%2==0)?x:y;
    }
}
