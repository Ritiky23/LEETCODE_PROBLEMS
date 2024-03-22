
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return true;
        }
        ListNode temp = head;
        int c = 0;
        int a = 0;
        Stack<Integer> st = new Stack<>();
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            a++;
            if (a <= c / 2) {
                st.push(temp.val);
            } else {
                if (st.peek() != temp.val) {
                    return false;
                } else {
                    st.pop();
                }
            }
            if (c % 2 == 1 && a == c / 2) {
                temp = temp.next;
                a++;
            }
            temp = temp.next;
        }
        return true;
    }
};
