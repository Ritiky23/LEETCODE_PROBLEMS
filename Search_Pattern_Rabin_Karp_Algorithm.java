class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        int i=0;
        int n=pattern.length();
        ArrayList<Integer> ans=new ArrayList<>();
        while(i<text.length()-pattern.length()+1){
            String sub=text.substring(i,n);
            if(sub.equals(pattern)){
                ans.add(i+1);
            }
            i++;
            n++;
            
        }
        return ans;
    }
}
