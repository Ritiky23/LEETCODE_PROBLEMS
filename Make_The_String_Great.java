class Solution {
    public String makeGood(String s) {
        if(s.length()==0){
            return "";
        }
        Stack<Character> stk = new Stack<>();
        int i = 0;
        while(i<s.length()){
            if(!stk.isEmpty() && (Math.abs(stk.peek() - s.charAt(i)) == 32)){
                stk.pop();
            }
            else{
                stk.push(s.charAt(i));
            }
            i++;
        }
        StringBuilder str = new StringBuilder();
        while(!stk.isEmpty()){
            str.append(stk.pop());
        }
        return str.reverse().toString();
    }
}
