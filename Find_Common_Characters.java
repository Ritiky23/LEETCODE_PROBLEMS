class Solution {
    public List<String> commonChars(String[] words) {
        int[] arr=new int[26];
        for(int i=0;i<words[0].length();i++)
        {
            arr[words[0].charAt(i)-'a']++;
        }
        int [] arr2=new int[26];
        for(int j=1;j<words.length;j++)
        {
            for(int k=0;k<words[j].length();k++)
            {
                arr2[words[j].charAt(k)-'a']++;
            }
            for(int l=0;l<arr.length;l++)
            {
                arr[l]=Math.min(arr[l],arr2[l]);
                arr2[l]=0;
            }
        }
        List<String> ans=new ArrayList<>();
        for(int m = 0; m < arr.length; m++) {
    if(arr[m] > 0) {
        for(int i = 0; i < arr[m]; i++) {
            ans.add(Character.toString((char)('a' + m)));
        }
    }
}
        return ans;
    }
}
