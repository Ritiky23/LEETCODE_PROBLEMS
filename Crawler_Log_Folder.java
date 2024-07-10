class Solution {
    public int minOperations(String[] logs) {
        if(logs == null || logs.length == 0) {
            return 0;
        }
        int depth = 0;
        for(int i = 0;i < logs.length; i++) {
            if(logs[i].equals("../")) {
                if(depth == 0) continue;
                depth--;
            } else if (logs[i].equals("./")) {
                continue;
            } else {
                depth++;
            }
        }
        return depth;
    }
}
