class Solution 
{
    ArrayList<Integer> ans = new ArrayList<Integer>();
    public List<Integer> sequentialDigits(int low, int high) 
    {
        int a=Integer.toString(low).charAt(0)-'0';
        for(int i=1;i<=9;i++)
        {   
            helper(low,high,i+1,new StringBuilder(String.valueOf(i)));
        }
        Collections.sort(ans);
        return ans;
    }
    public void helper(int low, int high, int i, StringBuilder sb)
    {
       int num = Integer.valueOf(sb.toString());
       if(low<=num && num<=high)
       {
           ans.add(num);
       }
       if(num>high)
         return;
       if(i>9)
         return;
        sb.append(String.valueOf(i));
        helper(low,high,i+1,sb);
        sb.deleteCharAt(sb.length()-1);
    }
}