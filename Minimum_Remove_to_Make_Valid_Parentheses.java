class Solution {
    public String minRemoveToMakeValid(String s) {
        boolean[] invalid = new boolean[s.length()];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                if (!stack.isEmpty() && s.charAt(stack.peek()) == '(') {
                    stack.pop();
                } else {
                    invalid[i] = true;
                }
            }
        }
        while (!stack.isEmpty()) {
            invalid[stack.pop()] = true;
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (!invalid[i]) sb.append(s.charAt(i));
        }
        return new String(sb);
    }
}
