class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p=head;
        int c=0;
        while(p!=null){
            c++;
            p=p.next;
        }
        int k=c-n;
        if(head.next==null && n==1) return null;
        if(k==0) return head.next;
        p=head;
        int i=0;
        ListNode prev=head;
        while(p!=null){
            p=p.next;
            i++;
            if(i==k){
                prev.next=p.next;
                p.next=null;
            }
            prev=p;
        }
        return head;
    }
}
