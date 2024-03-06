public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode p=head;
        ListNode t=head;
        if(head==null|| head.next==null) return false;
        while(t!=null && t.next!=null) {
                        p=p.next;
            t=t.next.next;
            if(p==t) return true;
            
        }
        return false;
        
    }
}
