class Solution {
    int max=Integer.MIN_VALUE;
    void rec(int ind,List<String> arr,HashMap<Character,Integer> hm,int sum)
    {
        if(ind==arr.size()) return;
        String s=arr.get(ind);
        int flag=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(hm.containsKey(ch)) 
            {
                flag=-1;
                rec(ind+1,arr,hm,sum);
                break;
            }
            if(set.contains(ch)) 
            {
                flag=-1;
                rec(ind+1,arr,hm,sum);
                break;
            }
            else set.add(ch);
        }
        if(flag==0) 
        {
            rec(ind+1,arr,hm,sum);
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                hm.put(ch,1);
                sum++;
            }
            if(sum>max) max=sum;
            rec(ind+1,arr,hm,sum);
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                hm.remove(ch);
            }
        }

    }
    public int maxLength(List<String> arr) {
        HashMap<Character,Integer> hm=new HashMap<>();
        rec(0,arr,hm,0);
        if(max==Integer.MIN_VALUE) return 0;
        return max;
    }
}