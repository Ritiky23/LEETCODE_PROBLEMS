class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stk=new Stack<>();
        List<Character> t=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                while(stk.peek()!='('){
                    t.add(stk.pop());
                }
                stk.pop();
                for(int j=0;j<t.size();j++){
                    stk.add(t.get(j));
                }
                t.clear();
            }else  stk.add(s.charAt(i));
        }
        String ans="";
        for(char i: stk){
            ans+=i;
        }
        System.out.println(stk);
        return ans;
       
        
    }
}
